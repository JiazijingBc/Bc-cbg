public class LC463 {
    public int islandPerimeter(int[][] grid) {
        int[][] ways = {{0,1},{0,-1},{1,0},{-1,0}};
        int i = grid.length;
        int j = grid[0].length;
        int ans = 0;
        for (int i1 = 0; i1 < i; i1++) {
            for (int i2 = 0; i2 < j; i2++) {
                if (grid[i1][i2]==1){
                    for (int[] way : ways) {
                        if (i1+way[0]<0 || i1+way[0]>=i){
                            ans++;
                        }else if(i2+way[1]<0 || i2+way[1]>=j){
                            ans++;
                        }else if(grid[i1+way[0]][i2+way[1]]==0){
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }

}
