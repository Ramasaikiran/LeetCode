class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=0) return 0;
        int count=0, mul=1,left=0;
        for(int i=0;i<nums.length;i++){
                mul*=nums[i];
                while(mul>=k && left<=i){
                    mul/=nums[left];
                    left++;
                }
            count+=(i-left+1);
            }
        return count;
    }
}