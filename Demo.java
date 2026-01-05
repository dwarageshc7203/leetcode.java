class Solution {
    public long maxMatrixSum(int[][] matrix) {

        int negC = 0;
        long sum = 0;
        long minabs = Integer.MAX_VALUE;

        for( int i = 0; i < matrix.length; i++){
            for( int j = 0; j < matrix[0].length; j++){

                int value = matrix[i][j];

                if(value < 0){
                    negC++;
                }
                minabs = Math.min( minabs, Math.abs(value));
                sum += Math.abs((long)value);
            }
        }
        if(negC % 2 == 1)
            sum -= 2L * minabs;

        return sum;
    }
}
public class Demo{
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] matrix = {{1, -1}, {-1, 1} };
        System.out.println(obj.maxMatrixSum(matrix));        
    }
}