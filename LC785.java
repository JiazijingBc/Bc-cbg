import java.util.Arrays;

public class LC785 {
    private static final int UNCOLORED = 0;
    private static final int RED = 1;
    private static final int GREEN = 2;
    private int[] color;
    private boolean valid;
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        valid=true;
        color=new int[n];
        Arrays.fill(color,UNCOLORED);
        for (int i=0;i<n&&valid;i++){
            if(color[i]==UNCOLORED){
                dfs(i,RED,graph);
            }
        }

        return valid;
    }
    public void dfs(int a,int c,int[][]graph){
        color[a] = c;
        int clin = c ==RED ? GREEN: RED;
        for (int i : graph[a]) {
            if(color[i] == UNCOLORED){
                dfs(i,clin,graph);
                if(!valid){
                    return;
                }
            }else if(color[i] != clin){
                valid = false;
                return;
            }

        }
    }
}
