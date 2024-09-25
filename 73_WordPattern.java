class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        
        String str[] = s.split(" ");
        if(pattern.length()!=str.length)
            return false;
        
        for(int i=0;i<pattern.length();i++)
        {
            String word = str[i];
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(word))
                    return false;
            }else{
                if(set.contains(word))
                    return false;
                else
                    set.add(word);
                    map.put(c,word);
                
            }
        }
        return true;
    }
}
