// Find the "Kth" max and min element of an array

// Completed

public class q3 {

    public static void main(String[] args) {
        int[] tempAr = { 73, 188, 894, 915, 940, 616, 900, 548 };
        int kth = Solution.kthSmallest(tempAr, 8, 0, 7);
        System.out.println("Value = " + kth);
    }

}

class Solution {

    static int kthSmallest(int arr[], int l, int r, int k) {
        if (k > 0 && k <= r - l + 1) {
            int pos = randomPartition(arr, l, r);

            if (pos - l == k - 1)
                return arr[pos];

            if (pos - l > k - 1)
                return kthSmallest(arr, l, pos - 1, k);

            return kthSmallest(arr, pos + 1, r, k - pos + l - 1);
        }

        return Integer.MAX_VALUE;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int arr[], int l, int r) {
        int x = arr[r], i = l;
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] <= x) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, r);
        return i;
    }

    static int randomPartition(int arr[], int l, int r) {
        int n = r - l + 1;
        int pivot = (int) (Math.random()) * (n - 1);
        swap(arr, l + pivot, r);
        return partition(arr, l, r);
    }

}
