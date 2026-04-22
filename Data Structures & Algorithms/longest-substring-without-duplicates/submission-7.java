class Solution {
  public int lengthOfLongestSubstring(String s) {
    int l = 0, r = 0, n = s.length(), maxLength = 0;
    HashSet<Character> seen = new HashSet<>();

    while (r < n) {
      while(seen.contains(s.charAt(r))){
        seen.remove(s.charAt(l));
        l++;
      }
      seen.add(s.charAt(r));
      maxLength=Math.max(maxLength,seen.size());
      r++;
    }

    return maxLength;
  }
}
