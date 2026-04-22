class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int right = i + 1;
            while(right < n && heights[right] >= height) {
                right++;
            }

            int left = i - 1;
            while(left >= 0 && heights[left] >= height) {
                left--;
            }
            
            right--;
            left++;
            
            maxArea = Math.max(maxArea, height * (right - left + 1));
        }
        return maxArea;
    }
}
