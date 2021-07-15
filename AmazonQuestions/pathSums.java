package AmazonQuestions;

public class pathSums {
    
    //DP
    //O(N*M) Time
    //O(1) Space
    static int maxSum(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(j ==0 || i ==0){
                    if(i>0) arr[i][j] += arr[i-1][j];
                    if(j>0) arr[i][j] += arr[i][j-1]; 
                }else{
                    arr[i][j] = Math.max(arr[i][j]+arr[i][j-1], arr[i][j]+arr[i-1][j]);
                }
            }
        }

        return arr[n-1][m-1];
    }

    //DP
    //O(N*M) Time
    //O(1) Space
    static int minSum(int [][] arr){
        int n = arr.length;
        int m = arr[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(j ==0 || i ==0){
                    if(i>0) arr[i][j] += arr[i-1][j];
                    if(j>0) arr[i][j] += arr[i][j-1]; 
                }else{
                    arr[i][j] = Math.min(arr[i][j]+arr[i][j-1], arr[i][j]+arr[i-1][j]);
                }
            }
        }

        return arr[n-1][m-1];
    }

    public static void main(String args[]){
        int [][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int [][] grid2 = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(maxSum(grid));
        System.out.println(minSum(grid2));
    }
}
