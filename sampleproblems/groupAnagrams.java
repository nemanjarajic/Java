package sampleproblems;
import java.util.*;

public class groupAnagrams {
    
    static List<List<String>> group(String[] strs){
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<List<String>>();

        for(String str:strs){
            String temp = sortStr(str);

            if(map.get(temp) == null){
                map.put(temp, new ArrayList<String>());
                map.get(temp).add(str);
            }else{
                map.get(temp).add(str);
            }
        }

        for(List<String> l:map.values()){
            res.add(l);
        }
        return res;
    }

    static String sortStr(String s){
        String temp = "";
        int [] occur = new int[26];

        for(int i = 0; i < s.length(); i++){
            int t = s.charAt(i) - 'a';
            occur[t]++;
        }

        for(int i = 0; i<26;i++){
            int t = occur[i];
            temp += (i+'a') *t;
        }
        return temp;
    }

    static <List<List<String>> group2(String [] strs){
        HashMap<String,ArrayList<String>> map = new HashMap<>();

        for(String str:strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);

            String sorted = String.copyValueOf(c);

            if(map.get(sorted) == null){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str);
        }

        return new ArrayList<List<String>>(map.values());

    }
    public static void main(String agrs[]){

    }
}
