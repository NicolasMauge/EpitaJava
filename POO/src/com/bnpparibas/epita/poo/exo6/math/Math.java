package com.bnpparibas.epita.poo.exo6.math;

public class Math {
    public static long factorielle(int n) throws FactorielleException {
        if(n<=39) {
            long result = 1L;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            if(result>0 ) {
                return result;
            } else {
                throw (new FactorielleException());
            }

        } else {
            throw (new FactorielleException());
        }
    }
}
