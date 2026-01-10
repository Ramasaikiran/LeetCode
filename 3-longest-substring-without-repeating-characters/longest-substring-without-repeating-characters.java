class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxlen=0;
        HashSet<Character>hm=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(hm.contains(ch)){
                hm.remove(s.charAt(left));
                left++;
            }
            hm.add(ch);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}