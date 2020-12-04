public class Offer04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for(int i= 0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(target == matrix[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length)
        {
            if(matrix[i][j] > target) i--;
            else if(matrix[i][j] < target) j++;
            else return true;
        }
        return false;
    }
}
