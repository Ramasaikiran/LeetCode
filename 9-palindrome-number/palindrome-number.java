class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 ) return false;
        if(x==0) return true;
        int org=x, rev=0;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
            if(org==rev) return true;
        }
        return false;
    }
}