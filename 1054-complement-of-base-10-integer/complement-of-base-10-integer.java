class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int result=0,placevalue=1;
        while(n>0){
            int rem=n%2;
            int flip=(rem==0)?1:0;
            result+=(flip*placevalue);
            placevalue*=2;
            n=n/2;
        }
        return result;
    }
}