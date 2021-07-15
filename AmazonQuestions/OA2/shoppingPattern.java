package AmazonQuestions.OA2;
import java.util.*;


public class shoppingPattern {
    
    static int solution(int n, int [][] edges){
        int res = Integer.MAX_VALUE;
        HashMap<Integer, Integer> degrees = new HashMap<>();
        boolean [][] isEdge = new boolean[n+1][n+1];

        for(int [] edge: edges){
            degrees.put(edge[0], degrees.getOrDefault(edge[0], 0)+1);
            degrees.put(edge[1], degrees.getOrDefault(edge[1], 0)+1);
            isEdge[edge[0]][edge[1]] = true;
            isEdge[edge[1]][edge[0]] = true;
        }

        for(int [] edge: edges){
            for(int i = 1; i <= n; i++){
                if(isEdge[i][edge[0]] && isEdge[i][edge[1]]){
                    int degree = degrees.get(i) + degrees.get(edge[0]) - 6;
                    res = Math.min(res,degree);
                }
            }
        }

        if(res == Integer.MAX_VALUE) return -1;
        
        return res;


        
    }

    public static void main(String[] args) {
        int [][] arr = new int[][]{{1,2},{1,3},{3,2},{4,1},{5,2},{3,6}};
        int n = 6;

        System.out.print(solution(n, arr));
    }
}
