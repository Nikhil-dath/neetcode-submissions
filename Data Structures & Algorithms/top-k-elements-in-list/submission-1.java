
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        // Step 2: Sort entries by values (descending)
        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        // Step 3: Get top K elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }
}
