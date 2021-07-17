package AmazonQuestions;

public class productOfArray {
    
    //O(N^2) Time
    //O(1) Space
    static int[] solution1(int [] nums){
        int size = nums.length;
        int[] res = new int[size];


        for(int i = 0; i < size; i++){
            int a = 1;
            for(int j = 0; j < size; j++){
                if(i != j) a *= nums[j];
            }
            res[i] = a;
        }

        return res;
        
    }

    //O(N) Time
    //O(1) Space
    static int [] solution2(int [] nums){
        int size = nums.length;
        int [] res = new int[size];

        res[0] = 1;
        for(int i = 1; i < size; i++){
            res[i] = res[i-1] * nums[i-1];
            System.out.print(res[i] + " ");
        }
        System.out.println();
        int t= 1;
        for(int j = size-1; j >= 0; j--){
            res[j] *= t;
            System.out.print(res[j] + " ");
            t *= nums[j];
        }

        return res;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        System.out.print(solution2(arr));
    }
}
