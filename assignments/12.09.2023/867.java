class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix[0].length;
        int [][] trans = new int[m][matrix.length];
        for(int i=0;i<m;i++){
            for(int j=0;j<matrix.length;j++){
                trans[i][j] = matrix[j][i];
               
            }
        }
        return trans;
    }
}