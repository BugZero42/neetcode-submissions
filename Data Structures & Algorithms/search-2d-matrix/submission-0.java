class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int potentialRow = searchPotentialRow(matrix,target);
        if(potentialRow!=-1){
            return binarySearchRow(potentialRow,matrix,target);
        }
        return false;

    }
    public int searchPotentialRow(int[][] matrix, int target){
        int low = 0;
        int high = matrix.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[mid][0]<=target && matrix[mid][matrix[0].length-1]>=target){
                return mid;
            }
            else if(matrix[mid][0]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    public boolean binarySearchRow(int row, int[][] matrix, int target){
        int low = 0;
        int high = matrix[0].length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                high = mid-1;
            }
            else{
                low = low+1;
            }
        }
        return false;
    }
}
