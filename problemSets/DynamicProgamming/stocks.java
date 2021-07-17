package DynamicProgamming;

public class stocks {
    static int best_time_to_sell(int [] arr){
        int len = arr.length, currMax = 0, res = 0;

        for(int i = 1; i < len; i++){
            currMax = Math.max(0, currMax+arr[i]-arr[i-1]);
            res = Math.max(res, currMax);
        }

        return res;
    }

    static int max_profit(int [] arr){
        int len = arr.length, res = 0;

        for(int i = 1; i < len; i++){
            res += Math.max(0,arr[i]-arr[i-1]);
        }

        return res;
    }
    public static void main(String args[]){
        int [] arr = {7,1,5,3,6,4};

        System.out.println(best_time_to_sell(arr));
        System.out.println(max_profit(arr));
    }
}
