class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
    private int atmost(int[] nums, int k){
        int count=0,l=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
        while(hm.size()>k){
            hm.put(nums[l],hm.get(nums[l])-1);
            if(hm.get(nums[l])==0){
                hm.remove(nums[l]);
            }
            l++;
        }
        count+=(r-l+1);
        }
        return count;
    }
}