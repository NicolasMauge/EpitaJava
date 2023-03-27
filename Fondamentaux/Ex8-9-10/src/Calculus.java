public class Calculus {
    /**
     * Cette fonction permet d'additionner deux entiers
     *
     * @param a : premier entier
     * @param b : deuxième entier
     * @return l'addition entre les deux entiers
     */
    public int add2Int(int a, int b){
        return a + b;
    }

    /**
     * Cette fonction permet de faire une division entière
     *
     * @param a : numérateur, entier
     * @param b : dénominateur, entier
     * @return : la division entière du numérateur par le dénominateur
     */
    public int euclideanDivision(int a, int b) {
        if(b==0) {
            System.out.println("Division par zéro");
        }

        return a / b;
    }

    /** Calcul de factoriel par récursion
     *
     * @param n le nombre dont on veut avoir la factorielle
     * @return la factorielle
     */
    public long factoriel(int n) {
        if(n==0) {
            return 1;
        }
        return n * factoriel(n-1);
    }

    /** Calcul de factoriel en itération
     *
     * @param n le nombre dont on veut avoir la factorielle
     * @return la factorielle
     */
    public long factorielIter(int n) {
        long result = 1;
        for(int i=2; i <= n;i++) {
            result *= i;
        }
        return result;
    }
}
