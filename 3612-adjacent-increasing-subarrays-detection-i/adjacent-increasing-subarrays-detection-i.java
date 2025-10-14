class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        boolean ans = false;
        for(int i = 0; i <= nums.size() - 2 * k; i++){
            boolean firstIncreasing = true;
            boolean secondIncreasing = true;
            for(int j = i; j < i + k - 1; j++){
                if(nums.get(j) >= nums.get(j + 1)){
                    firstIncreasing = false;
                    break;
                }
            }
            for(int j = i + k; j < i + 2 * k - 1; j++){
                if(nums.get(j) >= nums.get(j + 1)){
                    secondIncreasing = false;
                    break;
                }
            }
            if(firstIncreasing && secondIncreasing){
                ans = true;
                break;
            }
        }
        return ans;
    }
}