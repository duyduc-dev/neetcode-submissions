class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int num: nums) {
            boolean isAdded = false;
            if(map.containsKey(num - 1)) {
                map.get(num - 1).add(num);
            }
            for(var item: map.entrySet()) {
                if(item.getValue().contains(num - 1)) {
                    item.getValue().add(num);
                    isAdded = true;
                    break;
                }
            }
            if(!isAdded) {
                map.putIfAbsent(num, new HashSet<>());
                map.get(num).add(num);
            }
        }

        int maxSize = 0;
        for(int key: map.keySet()) {
            if(map.get(key).size() > maxSize) {
                maxSize = map.get(key).size();
            }
        }

        return maxSize;
    }
}
