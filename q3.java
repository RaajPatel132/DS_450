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
            if (arr[j] < min)
                min = arr[j];
            for (int n = j; n < arr.length - 1; n++) {
                arr[n] = arr[n + 1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] tempAr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int kth = kthSmallest(4, tempAr);
        System.out.println("Value = " + kth);
    }

}
