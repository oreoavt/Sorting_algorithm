//Fuentes: Jindal, H. (2023, 12 octubre). Ordenamiento Shell. Delft Stack. https://www.delftstack.com/es/tutorial/algorithm/shell-sort/

import java.util.Random;

class ShellSort {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    int sort(int arr[]) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        int n = 100000;
        int arr[] = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1000000); // Genera números aleatorios entre 0 y 999,999
        }

        System.out.println("Array before sorting:");
        printArray(arr);

        long startTime = System.currentTimeMillis();

        ShellSort ob = new ShellSort();
        ob.sort(arr);

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Array after sorting:");
        printArray(arr);

        System.out.println("Sorting took " + totalTime + " milliseconds.");
    }
}

