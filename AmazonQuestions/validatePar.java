package AmazonQuestions;
import java.util.*;

public class validatePar {
    
    static boolean isValid(String s){
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(' ){
                stk.push(s.charAt(i));
            }else{
                if(stk.empty() || (s.charAt(i) == ')' && stk.peek() != '(') || (s.charAt(i) == '}' && stk.peek() != '{')|| (s.charAt(i) == ']' && stk.peek() != '[')){
                    return false;
                }
                stk.pop();
            }

            
        }

        return stk.empty();
    }
    public static void main(String args[]){

    }
}
