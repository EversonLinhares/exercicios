package br.com.exercicios.exercicio4;

public class Exercicio {
    public static void main(String[] args) {

        SomaMultiplos somaMultiplos = new SomaMultiplos();

        int x = 20;
        int soma = somaMultiplos.somaMultiplosDeTresOuCinco(x);
        System.out.println("A soma dos múltiplos de 3 ou 5 até " + x + " é: " + soma);
    }
}
