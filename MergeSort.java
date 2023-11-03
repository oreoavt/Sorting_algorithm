//Merge code reference from https://www.geeksforgeeks.org/java-program-for-merge-sort/

import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(left);
            mergeSort(right);

            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    arr[k++] = left[i++];
                } else {
                    arr[k++] = right[j++];
                }
            }

            while (i < left.length) {
                arr[k++] = left[i++];
            }

            while (j < right.length) {
                arr[k++] = right[j++];
            }
        }
    }

    public static void main(String[] args) {
        int[] arr10000 = new int[10000];
        int[] arr100000 = new int[100000];
        int[] arr1000000 = new int[1000000];
         
        // Llena las matrices con valores aleatorios
        
        
        for (int i = 0; i < 10000; i++) {
            arr10000[i] = (int) (Math.random() * 10000);
        }
        
        
        
        /*
        for (int i = 0; i < 100000; i++) {
            arr100000[i] = (int) (Math.random() * 100000);
        }
        
        
        for (int i = 0; i < 1000000; i++) {
            arr1000000[i] = (int) (Math.random() * 1000000);
        }
        */

        // Registra la hora de inicio
        long startTime = System.currentTimeMillis();

        // Llama a la función que deseas medir
        mergeSort(arr10000);

        // Registra la hora de finalización
        long endTime = System.currentTimeMillis();

        // Calcula la duración de la ejecución
        long duration = endTime - startTime;

        // Imprime la duración en milisegundos
        System.out.println("Tiempo de ejecución: " + duration + " milisegundos");
    }
}
