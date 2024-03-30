package br.com.exercicios.exercicio2;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean trocado;

        for (int i = 0; i < n - 1; i++) {
            trocado = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocado = true;
                }
            }
            if (!trocado) {
                break;
            }
        }
    }
}
