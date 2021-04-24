// Find the "Kth" max and min element of an array

// Completed

public class q3 {
    static int kthSmallest(int k, int[] arr) {
        int i;
        for (i = 1; i < k; i++) {
            arr = removeMin(arr);
        }
        int len = arr.length;
        int min = arr[0];
        for (int j = 1; j < len; j++) {
            if (arr[j] < min)
                min = arr[j];
        }
        return min;

    }

    static int[] removeMin(int[] arr) {
        int len = arr.length;
        int j = 0;
        int min = arr[0];
        for (j = 1; j < len; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        for (j = 0; j < len; j++) {
            if (arr[j] == min) {
                for (int n = j; n < arr.length - 1; n++) {
                    arr[n] = arr[n + 1];
                }
                // System.out.println("removed " + arr[j]);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] tempAr = { 103, 23248, 332434, 4324, 5234, 1303, 2334248, 3324434, 43424, 54234 };
        int kth = kthSmallest(5, tempAr);
        System.out.println("Value = " + kth);
    }

}
