class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int nums[]) {
        // Your code here
        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0;
        int count = 0;
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                count++;
            }

            if (hash.containsKey(sum - k)) {
                count += hash.get(sum - k);
            }

            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        if(count>=1) return true;
        return false;
    }
}