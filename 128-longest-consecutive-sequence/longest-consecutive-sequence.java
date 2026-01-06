class Solution {
    public int longestConsecutive(int[] nums) {
       int longest=0;
       HashSet<Integer>hm=new HashSet<>();
       for(int num:nums){
        hm.add(num);
       }
      for(int num:hm){
        if(!hm.contains(num-1)){
           int currentnum=num;
            int streak=1;
        while(hm.contains(currentnum+1)){
            currentnum++;
            streak++;
        }
        longest=Math.max(longest,streak);
      }
      }
      return longest;
    }
}