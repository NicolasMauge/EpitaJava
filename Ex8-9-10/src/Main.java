public class Main {
    public static void main(String[] args) {
        Calculus calc = new Calculus();

        int result = calc.add2Int(50, 30);
        int result2 = calc.euclideanDivision(10,3);

        System.out.println("50 + 30 = " + result);

        System.out.println("10 // 3 = " + result2);
    }


}