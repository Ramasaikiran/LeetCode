class Solution {
    public void sortColors(int[] nums) {
        int mid=0,low=0,high=nums.length-1,temp1=0,temp2=0;
        while(mid<=high){
            if(nums[mid]==0){
                temp1=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp1;
                low++;
                mid++;
            }
            else if(nums[mid]==1) {
                mid++;
            }
            else{
                temp2=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp2;
                high--;
            }
        }
    }
}