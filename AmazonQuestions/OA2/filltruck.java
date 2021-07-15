package AmazonQuestions.OA2;

import java.util.*;

public class filltruck {
    
    static int solution(int[][] arr, int truckSize){
        int res = 0;

        Arrays.sort(arr, (a,b)-> (b[1]-a[1]));

        int i = 0;

        while(i < arr.length && truckSize > 0){
            if(truckSize-arr[i][0] >= 0){
                truckSize -= arr[i][0];
                res += arr[i][0]*arr[i][1];
            }else{
                res += arr[i][1]*truckSize;
                truckSize = 0;
            }
            i++;
        }

        return res;
    }
    public static void main(String args[]){
        int [][]arr = new int[][] {{1,3},{2,2},{3,1}};
        int truckSize = 4;

        System.out.print(solution(arr, truckSize));
    }
}
