class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<board.length ; i++){
            for(int j =0; j<board[0].length; j++){
                if(!isValid(i,j,board)) return false;
            }
        }
        return true;    
    }
    public boolean isValid(int row, int col ,char[][] board){
        if(board[row][col]=='.') return true;
        for(int i = 0; i<9; i++){
            if(board[row][i]==board[row][col] && i!=col) return false;
            if(board[i][col]==board[row][col] && i!=row) return false;

            if((3*(row/3)+i/3)!=row && (3*(col/3)+i%3)!=col && board[row][col] == board[(3*(row/3)+i/3)][(3*(col/3)+i%3)]) return false;

        }
        return true;
    }
}
