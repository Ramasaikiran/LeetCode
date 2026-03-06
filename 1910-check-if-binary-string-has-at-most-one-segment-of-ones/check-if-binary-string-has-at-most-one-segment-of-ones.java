class Solution {
    public boolean checkOnesSegment(String s) {
        int count=0,left=0;
        while(left<s.length()){
            if(s.charAt(left)=='1'){
            count++;
            if(count>1) return false;
            int right=left;
            while(right<s.length() && s.charAt(right)=='1'){
                right++;
            }
            left=right;
        }
        else left++;
        }
        return true;
    }
}