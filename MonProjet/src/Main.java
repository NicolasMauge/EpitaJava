public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int temp;

        a = 1;
        b = 2;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a + "," +  b);

        System.out.println(euclidianDivision(a, b));

        System.out.println(canBeDivided357(35));
        System.out.println(canBeDivided357(105));
    }

    public static Boolean canBeDivided357(int num) {
        return isDivisor(num, 3) && isDivisor(num, 5) && isDivisor(num, 7);
    }

    public static Boolean isDivisor(int num, int divisor) {
        return (num % divisor == 0);
    }

    public static int euclidianDivision(int num, int denom) {
        return num / denom;
    }

}