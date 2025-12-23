class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxlen=0;
        HashSet<Character>hm=new HashSet<>();
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(hm.contains(ch)){
                hm.remove(s.charAt(left));
                left++;
            }
            hm.add(ch);
            maxlen=Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}