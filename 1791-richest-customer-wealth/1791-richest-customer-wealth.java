class Solution {
    public int maximumWealth(int[][] accounts) {
        int n=accounts.length;
        int m=accounts[0].length;
        int val1=0;
        int val2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                val1=val1+accounts[i][j];
            }
            if(val1>val2){
                val2=val1;
            }
            val1=0;
        }
        return val2;
    } 
}