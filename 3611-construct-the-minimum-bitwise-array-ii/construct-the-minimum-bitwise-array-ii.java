class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int target=nums.get(i);
            if(target%2==0){
                ans[i]=-1;
            }
            else{
                int p=0;
                while(((target>>(p+1))&1)==1){
                    p++;
                }
                ans[i]=target-(1<<p);
            }
        }
        return ans;
    }
}