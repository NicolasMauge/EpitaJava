import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Morpion morpion = new Morpion();
        int[][] tableauDeJeu = new int[3][3];

        tableauDeJeu = morpion.initBoard(tableauDeJeu);

        morpion.drawBoard(tableauDeJeu);

        int player = 1;

        while(!morpion.isWinning(tableauDeJeu)) {
            System.out.println(">>>>Player : "+player);
            System.out.println("Entrez les coordonnées : ");

            while(true) {
                int x = askValue("Valeur x [1-3] : ");
                int y = askValue("Valeur y [1-3] : ");

                if (tableauDeJeu[y - 1][x - 1] == 0) {
                    tableauDeJeu[y - 1][x - 1] = player;
                    break;
                } else {
                    System.out.println("Cette position a déjà été jouée");
                }
            }

            morpion.drawBoard(tableauDeJeu);

            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
        }
        System.out.println("Player " + player + " a perdu");
    }

    public static int askValue(String question) {
        Scanner sc = new Scanner(System.in);
        int value;

        System.out.println(question);

        while(true) {
            value = sc.nextInt();

            if((value<1) || (value>3)) {
                System.out.println("Erreur");
            } else {
                break;
            }
        }

        return value;
    }
}