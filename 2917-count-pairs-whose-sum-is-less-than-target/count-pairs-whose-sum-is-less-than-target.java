class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int count=0,l=0,r=nums.size()-1;
        while(l<=r){
            if(nums.get(l)+nums.get(r)<target){
                count+=(r-l);
                l++;
            }
            else{ 
                r--;
            }
        }
        return count;
    }
}