public class Main {
    public static void main(String[] args) {
        Enfant charlotte = new Enfant("", "Charlotte", 19);
        Enfant olivier = new Enfant("", "Olivier", 15);
        Enfant sylvain = new Enfant("", "Sylvain", 18);

        charlotte.feterAnniversaire();

        charlotte.presentation();
        olivier.presentation();

        charlotte.joueAuBallon(olivier);

        charlotte.tomberAmoureux(sylvain);
        olivier.tomberAmoureux(charlotte);

        System.out.println(charlotte.estAmoureux());
        System.out.println(olivier.estAmoureux());
        System.out.println(sylvain.estAmoureux());
    }
}