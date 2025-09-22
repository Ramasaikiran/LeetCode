class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
                hm.put(i,hm.getOrDefault(i,0)+1);
            }
            int max=0;
            for(int freq:hm.values()){
                max=Math.max(freq,max);
            }
        int count=0;
        for(int freq:hm.values()){
            if(max==freq){
                count+=freq;
            }
        }
        return count;
    }
}