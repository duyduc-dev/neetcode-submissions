class Solution {
   
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mapFre = new HashMap<>();
        for(int num: nums) {
            mapFre.put(num, mapFre.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int key: mapFre.keySet()) {
            int index = mapFre.get(key);
            if(buckets[index] == null) {
                buckets[index] = new ArrayList();
            }
            buckets[index].add(key);
        }

        int[] res = new int[k];
        int resIndex = 0;
        for(int i = buckets.length - 1; i >= 0 && resIndex < k; i--) {
            if(buckets[i] != null) {
                for(int buc: buckets[i]) {
                    res[resIndex++] = buc;
                    if(resIndex == k) break;
                }
            }
        }   
        return res;
    }
}
