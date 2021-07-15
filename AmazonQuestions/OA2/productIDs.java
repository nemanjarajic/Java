package AmazonQuestions.OA2;
import java.util.*;
public class productIDs {
    
    static int solution(int []arr, int n, int m){
        
        //Create a hashmap to count the occur of each value
        HashMap<Integer, Integer> map = new HashMap<>();
        //Keep track of size of the map which is the count of unique values
        int size = 0;

        //Loop through the array and input values to the map
        for(int i =0 ; i< arr.length; i++){
            //If the value doesnt exist in map
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
                size++;
            }
            //Value is in map just increment the occurance of it
            else{
                int temp = map.get(arr[i]);
                map.put(arr[i], temp+1);
            }
        }

        //Create an array to count of the different occurances of the frequencies
        int []occur = new int[n+1];
        for(Integer it: map.values()){
            occur[it]++;
        }

        //We're looking to remove the most unique items so we have to start where the occurrances of frequencies are low
        //i starts at 1 beging we dont care about the frequency with the value of 0
        for(int i = 1; i <=n; i++){
            int temp = occur[i];
            //if a frequency has a value of 0 we skip it
            if(temp == 0) continue;

            int t = Math.min(temp, m/i);
            size -= t;
            m -= i*t;
        }

        return size;


        
    }

    //O(N) Time
    //O(N) Space
    public static void main(String[] args) {
        int [] arr = new int[]{2,2,1,3,3,3};
        int m = 3;
        int n = arr.length;

        System.out.println(solution(arr, n, m));

    }
}
