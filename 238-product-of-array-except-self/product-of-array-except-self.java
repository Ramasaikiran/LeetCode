class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        int res=1,zerocount=0;
     for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zerocount++;
                continue;
            }
            res*=nums[i];
     }
     for(int i=0;i<nums.length;i++){
        if(zerocount>1){
            arr[i]=0;
        }
        else if(zerocount==1){
            arr[i]=(nums[i]==0)?res:0;
        }
        else{
            arr[i]=res/nums[i];
        }
     }  
     return  arr;
    }
}