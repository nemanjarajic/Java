package AmazonQuestions.OA2;

import java.util.Arrays;
import java.util.Comparator;

public class sortLogs {
    
    static String[] reorderLog(String [] arr){
        if(arr.length == 0) return arr;


        Comparator<String> logComp = new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                String subString1 = s1.substring(s1.indexOf(' ')+1);
                String subString2 = s2.substring(s2.indexOf(' ')+1);

                if(subString1.charAt(0) <= '9'){
                    if(subString2.charAt(0)<='9'){
                        return 0;
                    }else{
                        return 1;
                    }
                }
                if(subString2.charAt(0) <= '9'){
                    return -1;
                }

                int stringComp = subString1.compareTo(subString2);
                if(stringComp == 0){
                    return s1.substring(0, s1.indexOf(' ')-1).compareTo(s2.substring(0, s2.indexOf(' ')-1));
                }
                return stringComp;
            }
        };
        Arrays.sort(arr,logComp);
        return arr;
    }
    public static void main(String args[]){
        String [] arr = new String[] {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        System.out.print(reorderLog(arr));
    }
}
