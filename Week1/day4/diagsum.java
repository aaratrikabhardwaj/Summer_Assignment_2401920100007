class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,r,c;
        r=mat.length;
        c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=mat[i][j];
                }
                if((i+j)==r-1)
            {
                sum+=mat[i][j];
            }
           

            }
        }
        if(r%2==1){
            sum=sum-mat[r/2][r/2];
        }
        return sum;
    }
}
