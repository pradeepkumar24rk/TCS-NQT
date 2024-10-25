import java.util.*;

/**
 * FequencySort
 */
public class FequencySort {
    public int[] frequencySort(int[] nums) {
        // Create a frequency map
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Create a list from the frequency map entries
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort the list based on frequency and value
        Collections.sort(list, (e1, e2) -> {
            int val = e1.getValue() - e2.getValue();
            if (val == 0) {
                return e2.getKey() - e1.getKey(); // Compare keys in descending order
            }
            return val;
        });

        // Update the nums array based on sorted frequencies
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int value = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                nums[index++] = value;
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        FequencySort sol = new FequencySort();
        int[] nums = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(sol.frequencySort(nums)));
    }
}
