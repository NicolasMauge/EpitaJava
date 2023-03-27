public class Main {
    public static void main(String[] args) {
        dessinerRectangle(5, 4);
    }

    public static void dessinerRectangle(int x, int y) {
        String ligne = "";
        for(int i=1;i<=x;i++){
            ligne += "O";
        }
        for(int j=1; j<=y;j++) {
            System.out.println(ligne);
        }
    }
}