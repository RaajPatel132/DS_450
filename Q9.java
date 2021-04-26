import java.util.*;

public class Q9 {
    static int getMinDiff(int[] arr, int n, int k) {
        ArrayList<Integer> changedList = new ArrayList<Integer>();
        boolean shouldLoop = true;
        int minIndex = 0;
        int maxIndex = 0;
        while (shouldLoop) {

            int index = 0;
            for (int i : arr) {
                if (arr[minIndex] > i)
                    minIndex = index;
                if (arr[maxIndex] < i)
                    maxIndex = index;
                index++;
            }
            System.out.println("Min = " + arr[minIndex] + ", Max = " + arr[maxIndex]);

            // System.out.println("Min index = " + minIndex + ", Max Index = " + maxIndex);

            // for (Integer integer : changedList) {
            // System.out.println("index = " + integer);
            // }
            if (changedList.contains(minIndex) && changedList.contains(maxIndex)) {
                shouldLoop = false;
            } else {
                if ((arr[maxIndex] - arr[minIndex]) > k) {
                    if (arr[maxIndex] < k || changedList.contains(maxIndex)) {
                        arr[minIndex] = arr[minIndex] + k;
                        changedList.add(minIndex);
                    } else if (changedList.contains(minIndex)) {
                        arr[maxIndex] = arr[maxIndex] + k;
                        changedList.add(maxIndex);
                    } else {
                        arr[maxIndex] = arr[maxIndex] - k;
                        arr[minIndex] = arr[minIndex] + k;
                        changedList.add(minIndex);
                        changedList.add(maxIndex);
                    }

                } else {
                    shouldLoop = false;
                }
                System.out.println("updated "+"Min = " + arr[minIndex] + ", Max = " + arr[maxIndex]);
            }
        }
        return arr[maxIndex] - arr[minIndex];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 4, 7, 2, 10, 3, 2, 1 };

        System.out.println("final difference is: " + getMinDiff(arr, 10, 5));

    }
}
