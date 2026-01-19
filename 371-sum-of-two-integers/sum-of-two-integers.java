class Solution {
    public int getSum(int a, int b) {
        int carry=0;
        int sum=carry;
        if(a!=0){
            sum+=a;
        }
        if(b!=0){
            sum+=b;
        }
        return sum;
    }
}