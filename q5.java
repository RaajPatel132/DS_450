// Move all the negative elements to one side of the array 

public class q5 {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static int[] moveToRight(int[] arr) {
        int n = arr.length;
        int veTill = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int tmp = arr[i];
                arr[i] = arr[veTill];
                arr[veTill] = tmp;
                veTill++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, -3, 7, 8, -4, -2, -9 };
        arr = moveToRight(arr);
        printArray(arr);

    }
}
