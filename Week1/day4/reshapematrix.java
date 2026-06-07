lass Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][]=new int[r][c];
        int m=mat.length,n=mat[0].length;
        if(m*n != r*c)
        return mat;
        else
        for(int k=0;k<(r*c);k++){
            arr[k/c][k%c]=mat[k/n][k%n];
        }
        return arr;
    }
}
View less
 
