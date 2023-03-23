public class Main {
    public static void main(String[] args) {
        exercise56();
        exercise7();
    }

    public static void exercise56(){
        String[] tableauSimple = {"première chaîne", "deuxième chaîne", "troisième chaîne"};

        System.out.println(tableauSimple[2]);

        System.out.println("Boucle...");
        for(String element : tableauSimple){
            System.out.println(element);
        }
    }


    public static void exercise7(){
        String[][][] tableau222 = new String[2][2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++) {
                    tableau222[i][j][k] = String.valueOf(i + j + k);
                }
            }
        }

        for(String[][] tableau22:tableau222){
            for(String[] tableau2:tableau22) {
                for(String element:tableau2) {
                    System.out.println(element);
                }
            }
        }
    }
}