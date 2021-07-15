package AmazonQuestions.OA2;
import java.util.*;

public class twoSum {
    
    //Hashmap
    // O(N) Time
    // O(N) Space
    static int[] two_sum(int [] arr, int target){
        int res[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target-arr[i])){
                res[0] = map.get(target-arr[i]);
                res[1] = i;
                break;
            }else{
                map.put(arr[i], i);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[] = {2,7,11,15};
        int target = 9;

        int t[] = two_sum(arr, target);

        for(int i = 0; i < t.length; i++){
            System.out.print(t[i] + " ");
        }
    }
}
