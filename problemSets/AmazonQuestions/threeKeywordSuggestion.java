package AmazonQuestions;
import java.util.*;

public class threeKeywordSuggestion {
    
    static List<List<String>> TKS(int numreviews, List<String> repository, String customerQuery){
        List<List<String>> res = new ArrayList<List<String>>();

        Collections.sort(repository);
        
        customerQuery.toLowerCase();

        for(int i = 1; i < customerQuery.length(); i++){
            String subStr = customerQuery.substring(0, i);
            List<String> query = new ArrayList<>();
            
            for(String s: repository){
                String temp = s.substring(0, i).toLowerCase();
                if(subStr.equals(temp) && query.size() != 3){ 
                    query.add(s);
                }
            }
            

            res.add(query);

        }


        return res;
    }
    public static void main(String args[]){
        int numreviews = 5;
        List<String> repository = new ArrayList<>();
        repository.add("mobile");
        repository.add("mouse");
        repository.add("moneypot");
        repository.add("monitor");
        repository.add("mousepad");

        String customerQuery = "mouse";

        List<List<String>> res = TKS(numreviews, repository, customerQuery);

        System.out.print(res);
    }
}
