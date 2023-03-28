package com.epita.fichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\lenic\\OneDrive\\Documents\\Git\\EpitaJava\\API\\src\\com\\epita\\fichiers\\paroles.txt");

        List<String> paroles;
        try {
            paroles = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(paroles);

        Map<String, Integer> map = nbOccurrence(paroles);

        System.out.println(map);

        // maximum
        int maximum = 0;
        String word = "";
        for(String key:map.keySet()) {
            int value = map.get(key);
            if(value > maximum) {
                maximum = value;
                word = key;
            }
        }
        System.out.println(word + " : " + maximum);

        List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println(list);
    }

    static public Map<String, Integer> nbOccurrence(List<String> fichier) {
        Map<String, Integer> dict = new HashMap<>();

        for(String ligne: fichier) {
            String[] ligneSplit = ligne.toLowerCase().replace(",", "").replace(".", "").split(" ");

            for(String word: ligneSplit) {
                if(dict.containsKey(word)) {
                    dict.put(word, dict.get(word)+1);
                } else {
                    dict.put(word, 1);
                }
            }
        }
        return dict;
    }
}
