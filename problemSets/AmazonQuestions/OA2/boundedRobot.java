package AmazonQuestions.OA2;

public class boundedRobot {
    
    static boolean solution(String instructions){
        int x = 0, y = 0;
        int angle = 0;

        for(char c: instructions.toCharArray()){
            if(c == 'L'){
                angle+= 90;
            }else if(c == 'R'){
                angle += 180;
            }

            angle %= 360;

            if(c == 'G'){
                if(angle == 0){
                    x += 1;
                }
                if(angle == 90){
                    y += 1;
                }
                if(angle == 180){
                    x -= 1;
                }

                if(angle == 270){
                    y-=1;
                }
            }
        }

        if(x == 0 && y == 0) return true;
        else if(angle != 0) return true;
        else return false;
    }

    public static void main(String args[]){
        String instructions = "GGLLGG";

        System.out.print(solution(instructions));
    }
}
