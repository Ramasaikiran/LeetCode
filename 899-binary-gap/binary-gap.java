class Solution {
    public int binaryGap(int n) {
        if(n==0) return 0;
        int last=-1,distance=0,current=0;
        while(n>0){
            if((n&1)==1){
                if(last!=-1){
                distance=Math.max(distance,current-last);
            }
            last=current;
        }
        n=n/2;
        current++;
        }
        return distance;
    }
}