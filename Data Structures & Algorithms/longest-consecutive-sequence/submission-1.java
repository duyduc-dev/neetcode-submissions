class Solution {
    public int longestConsecutive(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }

        int longest = 0;
        for(int num: nums) {
            int size = 1;
            while (set.contains(num + size)) {
                size++;
            }
            longest = Math.max(longest, size);
        }

        return longest;
    }
}
