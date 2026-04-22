class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int l = 0, r = n - 1;
        int count = 0;
        int index = 0;
        while(l < r) {
            while(r > l & (s.charAt(r) - 'a' >= 26 || s.charAt(r) - 'a' < 0 ) && (s.charAt(r) - '0' > 9 || s.charAt(r) - '0' < 0)) {
                r--;
            }
            while(l <  r && (s.charAt(l) - 'a' > 26 || s.charAt(l) - 'a' < 0) && (s.charAt(l) - '0' > 9 || s.charAt(l) - '0' < 0)) {
                l++;
            }
            if(l > r ) return false;
            if(s.charAt(r) != s.charAt(l)) {
                return false;
            }
            r--;
            l++;
        }
        return count == 0 ;
    }
}
