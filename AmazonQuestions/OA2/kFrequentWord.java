package AmazonQuestions.OA2;

import java.util.*;

public class kFrequentWord {
    
    static List<String> solution(String[] words, int k){
        HashMap<String, Integer> map = new HashMap<>();
        List<String> allwords = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            Integer temp = map.get(words[i]);
            if(temp != null){
                map.put(words[i], temp +1);
            }else{
                map.put(words[i], 1);
                allwords.add(words[i]);
            }
        }

        Collections.sort(allwords, new Comparator<String>(){
            public int compare(String s1, String s2){
                if(map.get(s2).compareTo(map.get(s1)) != 0){
                    return map.get(s2).compareTo(map.get(s1));
                }else{
                    return s1.compareTo(s2);
                }
            }
        });

        return allwords.subList(0, k);
    }

    public static void main(String args[]){
        String[] words = new String[]{"i","love","leetcode","i","love","coding"};
        int k = 2;
        System.out.print(solution(words, k));
    }
}
