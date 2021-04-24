public class q1 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };

        int len = array.length;
        for (int i = 0; i < (len / 2); i++) {
            int temp = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 - i] = temp;
        }
        for (int i = 0; i < len; i++) {
            System.out.println(", " + array[i]);
        }
    }
}
