class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int arr[]=new int[spells.length];
        for(int i=0;i<spells.length;i++){
         long minpotion=(success+spells[i]-1)/spells[i];
         int l=0,r=potions.length;
         while(l<r){
            int mid=l+(r-l)/2;
            if(potions[mid]<minpotion){
                l=mid+1;
            }
            else{
                r=mid;
            }
         }
         arr[i]=potions.length-l;
        }
        return arr;
    }
}