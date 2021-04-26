public class Q8 {

    static int maxSubarraySum(int arr[], int n) {
        int maxSum = -9999;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < (n - i + 1); j++) {
                // 1,2,3,4,5,6 for number of subarray

                int sum = 0;
                for (int k = j; k < (i + j); k++) {
                    sum = arr[k] + sum;
                    // System.out.println(arr[k]+"+");
                }
                // System.out.println("i = " + i + " j = " + j + " sum = " + sum);
                if (sum > maxSum || maxSum == -9999) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, -3, -4 };

        System.out.println("sum = " + maxSubarraySum(arr, 4));

    }

}
