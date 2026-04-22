class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> store = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            if(store.containsKey(nums[i])) {
                return true;
            }
            store.put(nums[i], 1);
        }
        return false;
    }
}