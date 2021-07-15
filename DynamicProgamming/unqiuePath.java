package DynamicProgamming;

public class unqiuePath {
    
    static int paths(int n, int m){
        int[][] dp = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }

        return dp[n-1][m-1];
    }

    static int paths2(int[][] grid, int n, int m){
        int [][] dp = new int[n][m];
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(grid[i][0] == 0 && flag == true) dp[i][0] = 1;
            else{ dp [i][0] = 0; flag = false;}
        }
        flag = true;
        for(int i = 0; i < m; i++){
            if(grid[0][i] == 0 && flag == true) dp[0][i] = 1;
            else{ dp [0][i] = 0; flag = false;}
        }

    
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i > 0 && j > 0){
                    if(grid[i][j] == 1) dp [i][j] = 0;
                    else dp[i][j] = dp[i-1][j] + dp[i][j-1];

                }
            }
        }

        return dp[n-1][m-1];

    }
    public static void main(String agrs[]){
        int n = 3, m = 7;
        int [][] grid = {{0,1},{0,0}};
        System.out.println(paths(n,m));
        System.out.println(paths2(grid,grid.length,grid[0].length));
    }
}
