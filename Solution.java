import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int leftR = 0;
        int leftC = 0;
        int rightR = matrix.length - 1;
        int rightC = matrix[0].length - 1;

        List<Integer> answer = new ArrayList<>();

        while( leftR <= rightR && leftC <= rightC)
        {
            //top side
            for(int i = leftC; i <= rightC; i++){
                answer.add(matrix[leftR][i]);
            }
            leftR++;

            //right side
            for( int i = leftR; i <= rightR; i++){
                answer.add(matrix[i][rightC]);
            }
            rightC--;


            //bottom side
            if( leftR <= rightR)
            {
                for(int i = rightC; i >= leftC; i--){
                    answer.add(matrix[rightR][i]);
                }
            }
            rightR--;

            //left side
            if(leftC <= rightC)
            {
                for(int i = rightR; i >= leftR; i--){
                    answer.add(matrix[i][leftC]);
                }
            }
            leftC++;
        }

        return answer;
    }
}