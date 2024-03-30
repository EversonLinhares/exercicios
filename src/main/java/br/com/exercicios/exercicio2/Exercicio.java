package br.com.exercicios.exercicio2;

import static br.com.exercicios.exercicio2.BubbleSort.bubbleSort;

public class Exercicio {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 4, 7, 1, 0, 6};

        System.out.println("Array antes da ordenação:");
        imprimirArray(array);

        bubbleSort(array);

        System.out.println("\nArray após a ordenação:");
        imprimirArray(array);
    }

    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
