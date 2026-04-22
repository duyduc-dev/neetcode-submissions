class Solution {
    public int[] productExceptSelf(int[] nums) {
        int multipleValue = 1;
        int zeroCount = 0;
        for(int num: nums) {
            if(num == 0) zeroCount++;
            else multipleValue *= num;
        }

        if(zeroCount > 1) return new int[nums.length];

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {
            if(nums[i] == 0) result[i] = multipleValue;
            else result[i] = zeroCount > 0 ? 0 : multipleValue / nums[i];
        }

        return result;
    }
}  
