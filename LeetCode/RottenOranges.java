public class RottenOranges
{
    public static int orangesRotting(int[][] grid)
    {
        int rows = grid.length;
        int column = grid[0].length;

        int time = -1;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < column; j++){
                if(grid[i][j] == 0 || grid[i][j] == 1){
                    continue;
                }

                else if(neighbours(grid, i, j)){
                    time++;
                }
            }
        }
        return time;
    }

    public static boolean neighbours(int[][] grid, int row, int column){

        boolean output;

        output = (
            neighbours(grid, row + 1, column) ||
            neighbours(grid, row - 1, column) ||  
            neighbours(grid, row, column + 1) ||    
            neighbours(grid, row, column + 1)
        );

        return output;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };
        System.out.println(orangesRotting(grid));
    }
}