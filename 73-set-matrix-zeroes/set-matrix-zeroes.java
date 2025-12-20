class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        boolean[] rowz=new boolean[rows];
        boolean[] colz=new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    rowz[i]=true;
                    colz[j]=true;
                }
            }
        }
                for(int i=0;i<rows;i++){
                    for(int j=0;j<cols;j++){
                        if(rowz[i] || colz[j]){
                            matrix[i][j]=0;
                        }
                    }
        }
    }
}