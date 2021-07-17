package AmazonQuestions;

public class wordSearch {
    static boolean visited[][];

    static boolean dfs(char [][] grid, String s, int i, int j, int index){
        //Checks to see index value is equal to the length of string
        if(index == s.length()){
            return true;
        }

        //Out of bounds, character at i,j of grid doesnt equal s at index, or i,j has been visited 
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != s.charAt(index) || visited[i][j]){
            return false;
        }

        //Marks the grid index as visited
        visited[i][j] = true;

        //Expands from that i,j index up,down,left,right 
        if(dfs(grid, s, i-1, j, index+1) || dfs(grid, s, i+1, j, index+1) || dfs(grid, s, i, j-1, index+1) || dfs(grid, s, i, j+1, index+1) ){
            return true;
        }
        //Resets the visited value to false for next search
        visited[i][j] = false;
        return false;
    }
    static boolean word_search(char [][] grid, String s){

        //Loops through all indices in the grid 
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                // checks to see if char at i,j is equal to char at index 0
                // Also complexs a dfs from i,j if char is equal to index 0 of string
                if(s.charAt(0) == grid[i][j] && dfs(grid,s,i,j,0)){
                    return true;
                }
            }
        }
        //Else returns false;
        return false;
    }

    //O(N*M*(4^S)) Time where N and M are row and col sizes and S is the length of the word
    //O(N) Space
    public static void main(String args[]){
        char [][] grid = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        visited = new boolean[grid.length][grid[0].length];

        System.out.println(word_search(grid, "ABCX"));
    }
}
