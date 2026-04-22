class Solution {
    private final String delimiter = "|";

    /**
     * Time: O(n)
     * Space: O(1)
     * @param strs
     * @return
     */
    public String encode(List<String> strs) {
        String result = "";
        for(int i = 0; i < strs.size(); i++) {
            String value = strs.get(i);
            result += value.length() + delimiter + strs.get(i);
        }
        return result;
    }

    /**
     * Time: O(n)
     * Space: 
     * @param str
     * @return
     */
    public List<String> decode(String str) {
         List<String> result = new ArrayList<>();
        int index = 0;
        while(index < str.length()) {
            String countWordStr = "";
            while (isDigit(str.charAt(index))) {
                countWordStr += str.charAt(index++);
            }
            if(!countWordStr.isEmpty() && str.charAt(index++) == delimiter.charAt(0)) { // delimiter
                int countWord = Integer.parseInt(countWordStr);
                String word = "";
                for (int i = 0; i < countWord; i++) {
                    word += str.charAt(index + i);
                }
                result.add(word);
                index += countWord;
            } else {
                index++;
            }
        }
        return result;
    }

    public boolean isDigit(char ch) {
        int val = ch - '0';
        return val >= 0 && val <= 9;
    }
}
