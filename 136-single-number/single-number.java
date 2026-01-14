class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2){
        if(nums.length==0 || nums.length==1) return nums[i];
                if(nums[i]!=nums[i+1] ){
                    return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}