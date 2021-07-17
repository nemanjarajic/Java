package string;
import java.util.*;

public class longestSubStrNRC {
    public static void main(String[] args) {
        String s1 = "pwwkew";
        System.out.println(solution(s1));
    }

    //Longest Substring without repeating characters
    static int solution(String str){
        int res =0;
        String str2 = "";
        int s = 0, e = 0;
        HashSet<Character> set = new HashSet<>();
        while(e<str.length()){
            if(!set.contains(str.charAt(e))){
                set.add(str.charAt(e));
                res = Math.max(res, set.size());
                e++;
                str2 = str.substring(s, e);
                System.out.println(str2);
            }else{
                set.remove(str.charAt(s));
                s++;
            }
        }
        return res;
    } 

    //O(n) time
    //O(n) space
    static int solution2(String s){
        Map<Character, Integer> lookup = new HashMap<>();
        int result = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++) {
            if(lookup.containsKey(s.charAt(right))) {
                left = Math.max(left, lookup.get(s.charAt(right)));
            }
            result = Math.max(result, right - left + 1);
            lookup.put(s.charAt(right), right + 1);
        }
        return result;
    }
}
