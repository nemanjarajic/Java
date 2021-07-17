package string;
import java.util.*;

public class groupAnagrams {
    public static void main(String[] args) {
        String [] arr = new String[] {"eat","tea","tan","ate","nat","bat"};

        System.out.print(solution(arr));
    }

    static ArrayList<List<String>> solution(String[] sArr){
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String s:sArr){
            char[] c = s.toCharArray();
            Arrays.sort(c);

            String sorted = String.copyValueOf(c);
            if(map.get(sorted) == null){
                map.put(sorted,new ArrayList<>());
            }

            map.get(sorted).add(s);
        }

        return new ArrayList<List<String>>(map.values());
    }
}
