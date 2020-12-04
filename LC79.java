public class LC79 {
    public boolean exist(char[][] board, String word) {
        int[][] visit = new int[board.length][board[0].length];
        for (int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    if(helper(board,word,0,i,j,visit))return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board, String word,int k,int i,int j,int[][] visit){
        if (board[i][j] != word.charAt(k)){
            return false;
        }
        visit[i][j] = 1;
        int[][] dic = {{0,1},{0,-1},{1,0},{-1,0}};
        boolean flag = false;
        if (k == word.length()-1){
            return true;
        }else {
            for (int[] ints : dic) {
                int newi = i + ints[0];
                int newj = j + ints[1];
                if (newi<0||newj<0||newi>=board.length||newj>=board[0].length)continue;
                if(visit[newi][newj]==1)continue;
                if(helper(board,word,k+1,newi,newj,visit)) {
                    flag = true;
                }
            }
        }
        visit[i][j] = 0;
        return flag;
    }

    public static void main(String[] args) {
        LC79 lc79 = new LC79();
        System.out.println(lc79.exist(new char[][]{{'A', 'B', 'C', 'E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
    }
}
