class Solution {
    public int sumOfUnique(int[] nums) {
        // HashMap<Integer,Integer>hm=new HashMap<>();
        // int count=0,sum=0;
        // for(int num:nums){
        //     hm.put(num,hm.getOrDefault(num,0)+1);
        // }
        // for(int num:nums){
        //     if(hm.get(num)==1){
        //         sum+=num;
        //     }
        // }
        // return sum;

        int freq[]=new int[101];
        int sum=0;
        for(int num:nums){
            freq[num]++;
            if(freq[num]==1){
                sum+=num;
            }
            else if(freq[num]==2){
                sum-=num;
            }
        }
        return sum;
    }
}