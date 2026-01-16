class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int curr=nums[0];
        int prev=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            int prev2=Math.max(prev,curr+nums[i]);
            curr=prev;
            prev=prev2;
        }
        return prev;
    }
}