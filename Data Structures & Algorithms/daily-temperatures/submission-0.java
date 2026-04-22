class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int temp = temperatures[i];
            for(int j = i + 1; j < temperatures.length; j++) {
                int tempFeture = temperatures[j];
                if(tempFeture > temp) {
                    result[i] = j - i;
                    break;
                }
            }
        }

        return result;
    }
}
