class Solution {
    public boolean exist(char[][] board, String word) {
        char[] word_arr = word.toCharArray();
        for(int i =0; i< board.length; i++){
            for(int j =0; j<board[0].length; j++){
                if(board[i][j]==word_arr[0] && helper(board,i,j,word_arr,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board, int i, int j, char[] word_arr, int curr_idx){
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]=='*'||board[i][j]!= word_arr[curr_idx]){
            return false;
        }
        if(curr_idx == word_arr.length-1) return true;
        char temp = board[i][j];
        board[i][j] = '*';
        boolean res =   helper(board,i+1,j,word_arr,curr_idx+1) ||
                        helper(board,i-1,j,word_arr,curr_idx+1) ||
                        helper(board,i,j+1,word_arr,curr_idx+1) ||
                        helper(board,i,j-1,word_arr,curr_idx+1);
        board[i][j] = temp;
        return res;
    }
}
