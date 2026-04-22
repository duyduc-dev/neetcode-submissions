class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
      int maxLength = 0;

      for (int i = 0; i < n; i++) {
        int[] seen = new int[128];

        for (int j = i; j < n; j++) {
          if (seen[s.charAt(j)] > 0) {
            break;
          }

          seen[s.charAt(j)] = 1;
          maxLength = Math.max(maxLength, j - i + 1);
        }
      }

      return maxLength;
    }
}
