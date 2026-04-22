class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int value = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i == j) continue;
                value *= nums[j];
            }
            result[i] = value;
        }
        return result;
    }
}  
