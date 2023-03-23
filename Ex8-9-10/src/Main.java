public class Main {
    public static void main(String[] args) {
        int result = add2Int(50, 30);

        int result2 = euclideanDivision(10,3);

        System.out.println("50 + 30 = " + result);

        System.out.println("10 // 3 = " + result2);
    }

    public static int add2Int(int a, int b){
        return a + b;
    }

    public static int euclideanDivision(int a, int b) {
        return a / b;
    }
}