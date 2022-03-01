class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<>(); 
        Map<String, Character> map2 = new HashMap<>(); 
        String str[] = s.split(" ");
        if(pattern.length() != str.length)
            return false;
        for(int i = 0; i < str.length; i++){
            if(map1.containsKey(pattern.charAt(i))){
                String cur1 = map1.get(pattern.charAt(i)).trim();
                String cur2 = str[i].trim();
                if(!cur1.equals(cur2)){
                    return false;
                }
            }
            else if(map2.containsKey(str[i].trim())){
                Character c1 = map2.get(str[i].trim());
                
                if(c1 != pattern.charAt(i)){
                    return false;
                }
            }
            else{
                String cur2 = str[i].trim();
                map1.put(pattern.charAt(i), cur2);
                map2.put(cur2, pattern.charAt(i));
            }
        }
        return true;
    }
}
