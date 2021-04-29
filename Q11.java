import java.util.*;

public class Q11 {

    static public int findDuplicate(int[] nums) {
        ArrayList<Integer> checkList = new ArrayList<Integer>();
        int repeatedItem = 0;
        for (int i : nums) {
            if (checkList.contains(i)) {
                repeatedItem = i;
                break;
            } else {
                checkList.add(i);
            }
        }
        return repeatedItem;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 4, 6, 7 };

        System.out.println(findDuplicate(arr));

    }

}
