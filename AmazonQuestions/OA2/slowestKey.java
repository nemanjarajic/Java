package AmazonQuestions.OA2;

public class slowestKey {
    
    static char solution(int [] arr, String keyPressed){
        if(arr.length == 0 || keyPressed.length() == 0) return ' ';

        int t = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i]-arr[i-1] > t){
                t = arr[i]-arr[i-1];
                index = i;
            }
        }



        return keyPressed.charAt(index);
    }

    public static void main(String args[]){
        int [] arr = new int[] {12,23,36,46,62};
        String keyPressed = "spuda";

        System.out.print(solution(arr, keyPressed));

    }
}
