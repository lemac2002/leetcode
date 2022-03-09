class Solution {
    public int lengthOfLastWord(String s) {
         int len = s.length()-1, length = 0;
        for (int i=len;i>=0;i--) {
            // we're in the middle of the last word
            if (s.charAt(i) != ' ') {
                length++;
            }
            // here is the end of last word
            else if (length > 0) {
                return length;
            }
        }
        return length;
    }
}    
//Simple
class Solution1 {
    public int lengthOfLastWord(String s) {
        String[] parts = s.split(" ");
        return parts[parts.length-1].length();
    }
}
