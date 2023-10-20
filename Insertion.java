import java.util.Random;

public class Insertion{
	public static void insertionSort(int array[]){
		int n = array.length;
		for(int j = 1; j < n; j++){
			int key = array[j];
			int i = j-1;
			while((i > -1) && (array[i] > key)){
				array[i+1] = array[i];
				i--;
			}
			array[i+1] = key;
		}
	}
	public static void main(String a[]){
		int[] arr1 = new int[100000];
        Random rand = new Random();
		for(int i=0; i< arr1.length; i++){
			arr1[i] = rand.nextInt(100000);
		}

		System.out.println("Before insertion sort");
		for(int i :arr1){
			System.out.print(i+ " ");
		}
		System.out.println(" ");
		System.out.println();

		long startTime = System.currentTimeMillis();

		insertionSort(arr1);

		long endTime = System.currentTimeMillis();

		System.out.println("After insertion sort");
		for(int i:arr1){
			System.out.print(i+" ");
		}
		long elapsedTime = endTime - startTime;
		System.out.println("\nTiempo de ejecución: " + elapsedTime + " milisegundos");
	}
}