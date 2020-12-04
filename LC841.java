import java.util.ArrayList;
import java.util.List;

public class LC841 {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visit = new boolean[rooms.size()];
        visit[0] = true;
        if (rooms.size()==0){
            return false;
        }
        dfs(rooms,rooms.get(0),visit);


        for (boolean b : visit) {
            if(b==false){
                return false;
            }
        }


        return true;
    }
    public void dfs(List<List<Integer>> rooms,List<Integer> keys,boolean[] visit){
        if (keys==null) return;
        for (Integer key : keys) {
            if (visit[key]){
                continue;
            }
            visit[key] = true;
            dfs(rooms,rooms.get(key),visit);
        }
    }

    public static void main(String[] args) {
        LC841 lc841 = new LC841();
        List<List<Integer>> rooms = new ArrayList<List<Integer>>();

    }
}
