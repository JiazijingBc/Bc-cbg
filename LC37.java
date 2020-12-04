public class LC37 {
    public void solveSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] blocks = new boolean[9][9];
        for(int i =0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j]!='.'){
                    int nums = board[i][j] - '1';
                    rows[i][nums] = true;
                    cols[j][nums] = true;
                    blocks[((i/3)+1)*((j/3)+1)-1][nums] = true;
                }
            }
        }
        dfs(board,rows,cols,blocks,0,0);

    }
    public boolean dfs(char[][] board,boolean[][] rows,boolean[][] cols,boolean[][] blocks,int i,int j){
        while (board[i][j]!='.'){
            if(j<8) {
                j++;
            }else{
                i++;
                j=0;
            }
            if(i==9){
                return true;
            }
        }

        for(int num=0;num<9;num++){
            if(!rows[i][num] && !cols[j][num] && !blocks[((i/3)+1)*((j/3)+1)-1][num]){
                board[i][j]= (char) (num + '1');
                rows[i][num] = true;
                cols[j][num] = true;
                blocks[((i/3)+1)*((j/3)+1)-1][num] = true;
                if(dfs(board, rows, cols, blocks, i, j)){
                    return true;
                }
                else {
                    rows[i][num] = false;
                    cols[j][num] = false;
                    blocks[((i/3)+1)*((j/3)+1)-1][num] = false;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }
    private boolean dfs1(char[][] board, boolean[][] row, boolean[][] col, boolean[][] block, int i, int j) {
        // 找寻空位置
        while (board[i][j] != '.') {
            if (++j >= 9) {
                i++;
                j = 0;
            }
            if (i >= 9) {
                return true;
            }
        }
        for (int num = 0; num < 9; num++) {
            int blockIndex = i / 3 * 3 + j / 3;
            if (!row[i][num] && !col[j][num] && !block[blockIndex][num]) {
                // 递归
                board[i][j] = (char) ('1' + num);
                row[i][num] = true;
                col[j][num] = true;
                block[blockIndex][num] = true;
                if (dfs1(board, row, col, block, i, j)) {
                    return true;
                } else {
                    // 回溯
                    row[i][num] = false;
                    col[j][num] = false;
                    block[blockIndex][num] = false;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    private void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        LC37 lc37 = new LC37();
        lc37.printBoard(board);
        lc37.solveSudoku(board);
        lc37.printBoard(board);
    }

}
