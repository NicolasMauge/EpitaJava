package org.example;

import org.example.application.IClientService;
import org.example.application.ServiceFactory;
import org.example.domaine.Adresse;
import org.example.domaine.Client;

public class Main {
    static IClientService service = ServiceFactory.getService();
    public static void main(String[] args) {
        Adresse adresse = new Adresse("20 rue Victor Hugo", "Paris", "75015");
        Client client = new Client("Durand", "Matthieu", adresse);

        service.createClient(client);
    }
}