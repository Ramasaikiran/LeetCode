class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[] {-1,-1};
        if(nums.length==0) return arr;
        int left=findbound(nums,target,true);
        if(left==-1) return arr;
        int right=findbound(nums,target,false);
        if(right==-1) return arr;
        arr[0]=left;
        arr[1]=right;
        return arr;
    }
        private int findbound(int nums[], int target, boolean isleft){
        int low=0,high=nums.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                result= mid;
                if(isleft){
                high=mid-1;
                } 
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return result;
        }
}
    