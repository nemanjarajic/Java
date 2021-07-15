package sampleproblems;

public class minSizeSubArray {
    
    static int minArray(int target, int [] nums){
        int res = Integer.MAX_VALUE, size = nums.length, sum = 0, start = 0;

        for(int i = 0; i < size; i++){
            sum += nums[i];

            if(sum >= target){
                while(start < size && sum >= target){
                    res = Math.min(res,i-start+1);
                    sum -= nums[start];
                    start++;
                }
            }
        }

        return res == Integer.MAX_VALUE? 0:res;
    }
    public static void main(String args[]){

    }
}
