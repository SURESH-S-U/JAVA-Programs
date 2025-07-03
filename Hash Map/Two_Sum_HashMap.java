import java.util.*;

public class Two_Sum_HashMap {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];               // Get the remaining value
            if (map.containsKey(remain)) {
                System.out.println("Indexes: " + map.get(remain) + " and " + i);
                return;
            }
            map.put(nums[i], i);   // Append  num as key and index as value.
        }
    }
}
