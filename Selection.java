//Selection sort code copied from https://www.javatpoint.com/selection-sort-in-java

import java.util.Random;

public class Selection {
    public static void Selection(int[] arr){
        for (int i = 0; i<arr.length-1; i++){
            int index = i;
            for (int j = i+1; j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    public static void main(String[] a) {
        int[] arr = new int[100];
        Random random = new Random();
        System.out.println("Before");
        for (int i = 0; i<arr.length; i++){
            arr[i] = random.nextInt(100);
        }

        long startTime = System.currentTimeMillis();
        Selection(arr);
        long endTime = System.currentTimeMillis();

        for(int i:arr){
            System.out.print(i + " ");
        }
        long tiempoTotal = endTime - startTime;
        System.out.print("\nTiempo en milisegundos: " + tiempoTotal);
    }
}
