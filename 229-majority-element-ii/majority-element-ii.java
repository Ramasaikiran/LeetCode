class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>result=new ArrayList<>();
        if(nums==null || nums.length==0) {
            return result;
        }
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int limit=nums.length/3;
        for(int key:hm.keySet()){
            if(hm.get(key)>limit){
                result.add(key);
            }
        }
        return result;
    }
}