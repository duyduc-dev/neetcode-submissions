class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int minHeight = heights[i];
            for (int j = i; j < heights.length; j++) {
                if(minHeight > heights[j]) {
                    minHeight = heights[j];
                }
                int max = minHeight * (j - i + 1);
                if(maxArea < max) {
                    maxArea = max;
                }
            }
        }
        return maxArea;
    }
}
