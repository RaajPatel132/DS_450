import java.util.*;

public class Q6 {

    static int doUnion(int a[], int n, int b[], int m) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (list.contains(a[i])) {
                continue;
            } else {
                list.add(a[i]);
            }
        }
        for (int i = 0; i < m; i++) {
            if (list.contains(b[i])) {
                continue;
            } else {
                list.add(b[i]);
            }
        }
        return list.size();
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 6, -3, 7, 8, -4, -2, -9 };
        int[] arr2 = { 11, 34, -2, -9 };
        System.out.println("length: " + doUnion(arr1, 8, arr2, 4));

    }

}
