class Solution {
    // O(n)
    public int[] twoSum(int[] nums, int target) {
        var store = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int nextValue = target - nums[i];
            if(store.containsKey(nextValue)) {
                return new int[] {store.get(nextValue),i};
            }
            store.put(nums[i], i);
        }
        return new int[] {};
    }
}
