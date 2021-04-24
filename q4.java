public class q4 {
    static void sort012(int a[], int n) {
        int l = 0;
        int m = 0;
        int h = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0)
                l++;
            else if (a[i] == 1)
                m++;
            else
                h++;

        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            if (total < l)
                a[i] = 0;
            if (total >= l && total < (m + l))
                a[i] = 1;
            if (total >= (m + l) && total < (m + l + h))
                a[i] = 2;
            total++;
        }

        for (int i = 0; i < n; i++){
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 1, 2, 0 };
        sort012(arr, 5);

    }
}
