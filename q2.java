//  Find the maximum and minimum element in an array

public class q2 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int min = 9999;
        int max = 0;

        int len = array.length;
        for (int i = 0; i < len; i++) {
            if (array[i] < min)
                min = array[i];
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("MIN value = " + min);
        System.out.println("MAX value = " + max);

    }
}
