class Solution {
    public int findSubarray(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == 0) {
                count++;
            }

            if (hash.containsKey(sum - 0)) {
                count += hash.get(sum - 0);
            }

            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        // if(count ==)
        return count;
    }
}
