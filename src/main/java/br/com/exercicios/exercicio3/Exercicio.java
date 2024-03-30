package br.com.exercicios.exercicio3;

public class Exercicio {
    public static void main(String[] args) {

        Fatorial fatorial = new Fatorial();

        int[] numeros = {0, 1, 2, 3, 4, 5, 6};
        for (int num : numeros) {
            System.out.println(num + "! = " + fatorial.calcularFatorial(num));
        }
    }
}
