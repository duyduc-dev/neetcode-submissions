class Solution {
    public int trap(int[] height) {
      int waterTrapped = 0;
        int n = height.length;
        int l = 0;
        int r = n - 1;
        int maxLeft = height[l];
        int maxRight = height[r];

        while (l <= r) {
            if (height[l] <= height[r]) {
                maxLeft = Math.max(maxLeft, height[l]);
                waterTrapped += maxLeft - height[l];
                l++;
            } else {
                maxRight = Math.max(maxRight, height[r]);
                waterTrapped += maxRight - height[r];
                r--;
            }
        }

        return waterTrapped;
    }
}
