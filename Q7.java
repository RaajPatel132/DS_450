public class Q7 {
    public static long[] rotate(long arr[], long n) {
        n--;
        long temp = arr[(int) n];
        for (int i = (int) n; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        return arr;
    }

    static void printArray(long arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        long[] arr = { 1, 6, 3, 7, 8, 4 };
        arr = rotate(arr, 6);
        printArray(arr);

    }
}
