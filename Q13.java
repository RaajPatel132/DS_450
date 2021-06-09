
class Q13 {

    static int maxSubarraySum(int arr[], int n) {
        int maxEndHere = 0;
        int maxSoFar = 0;
        for (int i = 0; i < n; i++) {
            maxEndHere += arr[i];
            System.out.println("ele : "+ arr[i]+" sum after = " +maxEndHere);

            if (maxEndHere < 0) {
                System.out.println(" - Not Taken");

                maxEndHere = 0;
            }
            if (maxSoFar < maxEndHere) {

                maxSoFar = maxEndHere;
                System.out.println("new max is "+maxSoFar);

            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

        System.out.println(maxSubarraySum(arr, 8));
    }
}
