public class Q10 {

    static int minJumps(int[] arr) {
        // int jumps = 0;
        // int startIndex = 0;
        // boolean shoudLoop = true;
        // while (shoudLoop) {
        // jumps++;
        // // System.out.println(startIndex + " + " + arr[startIndex]);
        // startIndex = arr[startIndex] + startIndex;
        // // System.out.println("= " + startIndex);
        // if (startIndex >= (arr.length - 1)) {
        // shoudLoop = false;
        // }

        // }

        // return jumps;

        int jumps = 0;
        int startIndex = 0;
        while (true) {
            jumps++;
            startIndex = arr[startIndex] + startIndex;
            if (startIndex >= (arr.length - 1)) {
                return jumps;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 7 };

        minJumps(arr);

    }

}
