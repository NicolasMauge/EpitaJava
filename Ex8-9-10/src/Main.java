public class Main {
    public static void main(String[] args) {
        Calculus calc = new Calculus();

        int n = 60;

        int result = calc.add2Int(50, 30);
        int result2 = calc.euclideanDivision(10, 3);

        System.out.println("50 + 30 = " + result);
        System.out.println("10 // 3 = " + result2);

        //System.out.println("10 // 0 = ");
        //int result3 = calc.euclideanDivision(10, 0);

        long startTime = System.nanoTime();
        for(int i=0;i< 1000;i++) {
            long value = calc.factoriel(n);
            //System.out.println("Factoriel de " + n + " = " + calc.factoriel(n));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println(duration);


        startTime = System.nanoTime();
        for(int i=0;i< 1000;i++) {
            long value = calc.factorielIter(n);
            //System.out.println("Factoriel de " + n + " (avec une boucle) = " + calc.factorielIter(n));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println(duration);
    }

}