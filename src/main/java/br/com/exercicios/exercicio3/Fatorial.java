package br.com.exercicios.exercicio3;

public class Fatorial {
    public static int calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número não deve ser negativo.");
        }

        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
