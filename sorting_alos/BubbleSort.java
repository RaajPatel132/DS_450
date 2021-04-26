package sorting_alos;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 3, 7, 8, 4, 2, 9, 5 };
        arr = sort(arr);
        printArray(arr);

    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static int[] sort(int[] arr) {
        boolean shouldLoop = true;
        int n = arr.length;
        while (shouldLoop) {
            shouldLoop = false;
            for (int i = 0; i < n - 1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    shouldLoop = shouldLoop || true;
                } else {
                    continue;
                }
            }

        }
        return arr;
    }
}
