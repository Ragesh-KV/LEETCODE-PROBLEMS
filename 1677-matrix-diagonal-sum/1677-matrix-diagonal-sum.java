class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int sum=0;
        if(n==1){
            return mat[0][0];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            if(j==i||n==i+j+1){
                sum+=mat[i][j];
            }
            }
        }
        return sum;

    }
}