//Bubble code reference from https://www.geeksforgeeks.org/java-program-for-bubble-sort/

import java.util.Arrays;

public class BubbleSort {
     

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // Si no hubo intercambios en este pase, el arreglo ya está ordenado
            if (!swapped) {
                break;
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
        
        
        
        for (int i = 0; i < 100000; i++) {
            arr100000[i] = (int) (Math.random() * 100000);
        }
        
        for (int i = 0; i < 1000000; i++) {
            arr1000000[i] = (int) (Math.random() * 1000000);
        }
        

        // Ordena las matrices
        //bubbleSort(arr10000);
        //bubbleSort(arr100000);
        //bubbleSort(arr1000000);

       
        long startTime = System.currentTimeMillis();
        
        bubbleSort(arr1000000);

        // Registra la hora de finalización
        long endTime = System.currentTimeMillis();

        // Calcula la duración de la ejecución
        long duration = endTime - startTime;

        // Imprime la duración en milisegundos
        System.out.println("Tiempo de ejecución: " + duration + " milisegundos");

        // Puedes imprimir las matrices ordenadas si lo deseas
        // System.out.println(Arrays.toString(arr10000));
        // System.out.println(Arrays.toString(arr100000));
        // System.out.println(Arrays.toString(arr1000000));
    }
}
