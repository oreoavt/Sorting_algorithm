//Fuente: Ordenación Quicksort - Java. (2022, 3 septiembre). Java. https://codigojava.online/ordenacion-quicksort/

import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {
        int n = 100000;
        int vec[] = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            vec[i] = rand.nextInt(100000); // Genera números aleatorios entre 0 y 999,999
        }

        System.out.println("Vector original:");
       

        long startTime = System.currentTimeMillis();

        ordenacionRapida(vec);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Vector ordenado:");
        

        System.out.println("Sorting took " + totalTime + " milliseconds.");
    }

    public static void ordenacionRapida(int vec[]) {
        quickSort(vec, 0, vec.length - 1);
    }

    public static void quickSort(int vec[], int inicio, int fin) {
        if (inicio >= fin)
            return;

        // Optimiza la elección del pivote utilizando la mediana de tres.
        int pivote = medianaDeTres(vec, inicio, fin);

        int elemIzq = inicio;
        int elemDer = fin;

        while (elemIzq <= elemDer) {
            while (vec[elemIzq] < pivote) {
                elemIzq++;
            }
            while (vec[elemDer] > pivote) {
                elemDer--;
            }
            if (elemIzq <= elemDer) {
                int temp = vec[elemIzq];
                vec[elemIzq] = vec[elemDer];
                vec[elemDer] = temp;
                elemIzq++;
                elemDer--;
            }
        }

        if (inicio < elemDer) {
            quickSort(vec, inicio, elemDer);
        }
        if (elemIzq < fin) {
            quickSort(vec, elemIzq, fin);
        }
    }

    // Método para encontrar la mediana de tres elementos en el array.
    private static int medianaDeTres(int vec[], int inicio, int fin) {
        int medio = (inicio + fin) / 2;
        if (vec[inicio] > vec[medio]) {
            int temp = vec[inicio];
            vec[inicio] = vec[medio];
            vec[medio] = temp;
        }
        if (vec[inicio] > vec[fin]) {
            int temp = vec[inicio];
            vec[inicio] = vec[fin];
            vec[fin] = temp;
        }
        if (vec[medio] > vec[fin]) {
            int temp = vec[medio];
            vec[medio] = vec[fin];
            vec[fin] = temp;
        }
        return vec[medio];
    }
}
