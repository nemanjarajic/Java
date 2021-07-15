package AmazonQuestions;
import java.util.*;

public class numberOfIslands {
    
    static int dfs(char [][] grid,int i , int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0'){
            return 0;
        }

        grid[i][j] = '0';

        dfs(grid, i-1,j);
        dfs(grid, i+1,j);
        dfs(grid, i,j+1);
        dfs(grid, i,j-1);

        return 1;
    }

    //O(N*M* DFS complextity) Time
    //O(1) Space
    static int count(char [][] grid){
        int res = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    res += dfs(grid, i ,j);
                }
            }
        }

        return res;
    }

    static class coordinate{
        int x;
        int y;

        coordinate(int x , int y){
            this.x = x;
            this.y = y;
        }
    }

    static boolean [][]visited;
    static int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    static void bfs(char [][] arr, Queue<coordinate> q){
        int n = arr.length, m = arr[0].length;


        while(!q.isEmpty()){
            coordinate curr = q.poll();

            for(int [] d: dir){
                int x = curr.x + d[0];
                int y = curr.y + d[1];

                if(x < 0 || y < 0 || x >= n || y >= m || visited[x][y] == true || arr[x][y] == '0'){
                    continue;
                }

                visited[x][y] = true;
                coordinate next = new coordinate(x, y);
                q.add(next);
            }
        }
        
    }
    
    //O(N*M) Time
    //O(N*M) space
    static int countBFS(char[][] grid){
        int res = 0;
        int n = grid.length, m = grid[0].length;
        Queue<coordinate> q = new LinkedList<>();
        visited = new boolean[n][m];
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1' && visited[i][j] != true){
                    
                    q.add(new coordinate(i, j));
                    visited[i][j] = true;
                    bfs(grid, q);
                    res ++;
                }
            }
        }

        return res;
    }
    public static void main(String args[]){
        char [][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};

        System.out.println(countBFS(grid));
    }
}
