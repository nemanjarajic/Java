package AmazonQuestions;

public class romanToInt {
    static int toInt(char a){
        if(a == 'I') return 1;
        if(a == 'V') return 5;
        if(a == 'X') return 10;
        if(a == 'L') return 50;
        if(a == 'C') return 100;
        if(a == 'D') return 500;
        if(a == 'M') return 1000;
    
        return 0;
    }

    static int roman_to_int(String s){
        int res = 0;
        int size = s.length();
        for(int i = 0; i < s.length();i++){
           

            if(i < size -1 && toInt(s.charAt(i)) < toInt(s.charAt(i+1))){
                res -= toInt(s.charAt(i));
            }else{
                res += toInt(s.charAt(i));
            }
        }

        return res;
    }
    public static void main(String args[]){
        
    }
}
