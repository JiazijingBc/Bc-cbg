import java.util.HashSet;

public class LC130 {

    public void solve(String[][] board) {
        for(int i = 0;i<board.length;i++){
            if(i == 0 || i==board.length-1){
                for (int j = 0;j<board[0].length;j++){
                    solution(board,i,j);
                }
            }
            else {
                solution(board,i,0);
                solution(board,i,board.length-1);
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=="O") {
                    board[i][j] = "X";
                }
            }
        }
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j]=="B") {
                    board[i][j] = "O";
                }
            }
        }
    }

    public void solution(String[][] board,int i,int j){
        if ("O".equals(board[i][j])){
            board[i][j] = "B";
            if(i+1<board.length){
                solution(board,i+1,j);
            }
            else if(j-1>=0){
                solution(board,i,j-1);
            }
            else if(i-1 >= 0){
                solution(board,i-1,j);
            }
            else if( j-1 >= 0){
                solution(board,i,j+1);
            }

        }
        return;
    }

    public static void main(String[] args) {
        LC130 lc130 = new LC130();
        String[][] a = {{"X","X","X","X"},{"X","O","O","X"},{"X","X","O","X"},{"X","O","X","X"}};
        lc130.solve(a);
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
