package AmazonQuestions;
import java.util.*;

public class mergeIntervals {
    
    //O(N log(N)) Time
    //O(N) Space
    static int [][] merge(int [][] arr){
        if(arr.length == 0 || arr == null){
            return arr;
        }

        Arrays.sort(arr, (a,b) -> a[0] -b[0]);


        Stack<int[]> stk = new Stack<>();

        stk.push(arr[0]);

        for(int [] n: arr){
            int [] top = stk.peek();

            if(top[1] < n[0]){
                stk.push(n);
            }

            else if( top[1] < n[1]){
                top[1] = n[1];
                stk.pop();
                stk.push(top);
            }
        }

        return stk.toArray(new int [stk.size()][2]);

    }
    public static void main(String args[]){
        int [][] arr = {{1,3},{2,6},{8,10},{15,18}};

        int [][] res = merge(arr);

        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
