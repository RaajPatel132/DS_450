public class Q14 {
    static int[][] merge(int[][] intervals) {
        int[][] merged = new int[4][2];
        int length = intervals.length;
        for (int i = 0; i < length - 1; i++) {
            merged[i][0] = intervals[i][0];

            if (intervals[i][1] >= intervals[i + 1][0]) {
                merged[i][1] = intervals[i + 1][1];
                i++;
            }
        }
        return merged;
    }

    public static void print2D(int mat[][]) {
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                System.out.print("mat[" + i + "][" + j + "] " + mat[i][j] + " ");
    }

    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        print2D(merge(intervals));
    }
}
