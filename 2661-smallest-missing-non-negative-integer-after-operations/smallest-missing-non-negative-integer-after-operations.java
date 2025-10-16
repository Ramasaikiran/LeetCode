class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int [] count=new int[value];
        for(int i:nums){
            int r=i%value;
            if(r<0) r+=value;
            count[r]++;
        }
            int x=0;
            while(true){
                int r=x%value;
                int k=x/value;
                if(k+1>count[r]){
                    return x;
                }
                x++;
        }
    }
}