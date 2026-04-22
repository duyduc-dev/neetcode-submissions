class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String word = strs[i];
            boolean added = false;
            Set<String> keys = map.keySet();
            for(String key: keys) {
                if(isAnagram(key, word)) {
                    List<String> words = new ArrayList<>(map.get(key));
                    words.add(word);
                    map.put(key, words);
                    added = true;
                }
            }
            if(!added) map.put(word, List.of(word));
        }

        for(String key: map.keySet()) {
            List<String> words = map.get(key);
            result.add(words);
        }

        return result;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        var countS = new HashMap<Character, Integer>();
        var countT = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
    }
}
