package AmazonQuestions.OA2;
import java.util.*;

public class maximumPass {
    
    static double solution(int [][] arr, int extraStudents){
        double res = 0;
        
        double value = Integer.MAX_VALUE;
        double sum = 0;
        for(int i = 0; i < arr.length;i++){
             double t = (double)arr[i][0]/arr[i][1];
             sum += t;
        }

        System.out.println(sum);
        double max = 0;
        for(int i = 0; i < arr.length;i++){
            double t = (double)arr[i][0]/arr[i][1];
            double temp = sum;
            temp -= t;
            double x = ((double)arr[i][0]+extraStudents)/((double)arr[i][0]+extraStudents);
            temp += x;
            temp = temp/arr.length;

            max = Math.max(max, temp);
        }




        return max;
    }


    public static void main(String args[]){
        int [][]arr = new int[][] {{1,2},{3,5},{2,2}};
       //int [][]arr = new int[][]{{2,4},{3,9},{4,5},{2,10}};
        int extraStudents = 2;

        System.out.print(solution(arr, extraStudents));

    }
}
