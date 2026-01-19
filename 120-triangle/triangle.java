class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            List<Integer>current=triangle.get(i);
            for(int j=0;j<current.size();j++){
                dp[j]=current.get(j)+Math.min(dp[j], dp[j+1]);
            }
        }
        return dp[0];
    }
}