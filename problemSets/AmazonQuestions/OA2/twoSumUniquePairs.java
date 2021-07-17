package AmazonQuestions.OA2;
import java.util.*;

public class twoSumUniquePairs {
    
    static int solution(int [] arr, int target){
        int res = 0;
        Set<Integer> seen = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target-arr[i])){
                if(!seen.contains(target-arr[i]) || !seen.contains(arr[i])){
                    res++;
                    seen.add(target-arr[i]);
                    seen.add(arr[i]);
                }
            }else{
                map.put(arr[i], i);
            }
        }


        return res;
    }


    public static void main(String args[]){
        //int [] arr = new int[]{1,1,2,45,46,47};
        //int [] arr = new int[] {1,5,1,5};
        int [] arr = new int[]{1,1};
        int target = 2;

        System.out.print(solution(arr, target));
    }
}
