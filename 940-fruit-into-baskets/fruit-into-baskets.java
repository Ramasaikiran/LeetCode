class Solution {
    public int totalFruit(int[] fruits) {
        int maxlen=0,l=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int r=0;r<fruits.length;r++){
           hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
           while(hm.size()>2){
            int left=fruits[l];
            hm.put(left,hm.get(left)-1);
            if(hm.get(left)==0){
                hm.remove(left);
            }
            l++;
           }
           maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}