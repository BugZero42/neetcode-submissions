class Solution {
    public void rotate(int[][] matrix) {
        //tranpose
        int n = matrix.length;
        for(int i =0; i<n; i++){
            for(int j =i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse rows
        for(int i = 0; i<matrix.length; i++){
            int l = 0;
            int r = matrix[0].length -1;
            while(l<r){
                int temp  = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }

        }
        
    }
}
