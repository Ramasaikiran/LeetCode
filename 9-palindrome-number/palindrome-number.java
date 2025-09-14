class Solution {
    public boolean isPalindrome(int x) {
        boolean ans=false;
       if(x<0){
        return false;
       }
       if(x>=0 && x<=9){
        return true;
       }
      int rev=0,org=x;
      while(x>0){
        rev=rev*10+x%10;
        x=x/10;
      }
      if(rev==org){
        ans=true;
      }
      else{
         ans=false;
      }
      return ans;
    }
}