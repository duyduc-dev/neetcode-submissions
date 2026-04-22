class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Map<String, List<Integer>> res = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int j = i + 1, k = n - 1;
            while(j < k) {
                if(j == k) break;
                if(nums[j] + nums[k] > -nums[i]) k--;
                else if(nums[j] + nums[k] < -nums[i]) j++;
                else {
                    Integer[] key = new Integer[] {nums[i], nums[j], nums[k]};
                    Arrays.sort(key);
                    res.put(Arrays.toString(key), List.of(key));
                    j++;
                };
            }
        }
        return res.values().stream().toList();
    }
}
