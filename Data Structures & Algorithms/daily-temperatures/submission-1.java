class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Map<Integer, Integer> map = new HashMap();
        Stack<Integer> stack = new Stack();
        int[] result = new int[n];

        stack.push(temperatures[n - 1]);
        map.put(temperatures[n - 1], n - 1);

        for(int i = n - 2; i >= 0; i--) {
            Integer maxTemp = stack.peek();
            int curr = temperatures[i];
            while(maxTemp != null && curr >= maxTemp) {
                map.remove(maxTemp);
                stack.pop();
                maxTemp = stack.isEmpty() ? null : stack.peek();
            }
            if(maxTemp != null && curr < maxTemp) {
                int indexMaxTemp = map.get(maxTemp);
                result[i] = indexMaxTemp - i;
            }
            stack.push(curr);
            map.put(curr, i);
        }
        return result;
    }
}
