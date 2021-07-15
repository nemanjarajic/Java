package DynamicProgamming;

public class pathSum {
    
    public static int maxPath(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int [][] temp = grid;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0){
                    if(i > 0 && j == 0) temp[i][j] += temp[i-1][j];
                    if(i == 0 && j > 0) temp[i][j] += temp[i][j-1];
                }else{
                    temp[i][j] = Math.max(temp[i][j-1]+temp[i][j],temp[i-1][j]+temp[i][j]);
                }
            }
        }

        return temp [n-1][m-1];
    }

    public static int minPath(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int [][] temp = grid;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0){
                    if(i > 0 && j == 0) temp[i][j] += temp[i-1][j];
                    if(i == 0 && j > 0) temp[i][j] += temp[i][j-1];
                }else{
                    temp[i][j] = Math.min(temp[i][j-1]+temp[i][j],temp[i-1][j]+temp[i][j]);
                }
            }
        }

        return temp [n-1][m-1];
    }
    public static void main(String agrs[]){
        int[][] grid = {{2,3,4,5,6},
                        {3,2,3,1,1},
                        {5,3,2,2,1},
                        {1,1,4,2,2}};
        
        //System.out.println(maxPath(grid));
        System.out.println(minPath(grid));
    }
}
