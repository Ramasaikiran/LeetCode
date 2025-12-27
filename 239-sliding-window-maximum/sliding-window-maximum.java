class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length-k+1];
        if(nums.length==0 || nums==null ||  k<=0) return new int[0];
        Deque<Integer>hm=new ArrayDeque<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
        while(!hm.isEmpty() && hm.peekFirst()<i-k+1){
            hm.pollFirst();
        }
        while(!hm.isEmpty() && nums[hm.peekLast()]<nums[i]){
            hm.pollLast();
        }
        hm.offerLast(i);
        if(i>=k-1){
            arr[index++]=nums[hm.peekFirst()];
        }
        }
        return arr;
    }
}