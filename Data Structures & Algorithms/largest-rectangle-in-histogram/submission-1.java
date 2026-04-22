class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer[]> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            if(!stack.isEmpty() && height < stack.peek()[1]) {
                Integer[] last = stack.pop();
                while (last != null && last[1] > height) {
                    int area = last[1] * (i - last[0]);
                    if(maxArea < area) maxArea = area;
                    if(!stack.isEmpty() && stack.peek()[1] < height) {
                        break;
                    }
                    last = stack.isEmpty() ? null : stack.pop();
                }
                int index = last == null ? 0 : last[0];
                stack.push(new Integer[] { index, height });
            } else if(stack.isEmpty() || height > stack.peek()[1]) {
                stack.push(new Integer[] { i, height });
            }
        }

        if(!stack.isEmpty()) {
            Integer[] curr = stack.pop();
            int lastIndex = heights.length - 1;
            while(curr != null) {
                int area = (lastIndex - curr[0] + 1) * curr[1];
                if(maxArea < area) maxArea = area;
                curr = stack.isEmpty() ? null : stack.pop();
            }
        }

        return maxArea;
    }
}
