package AmazonQuestions.OA2;
import java.util.*;

public class stringToPrimes {
    static Set<Integer> map = new HashSet<>();

    static boolean primeNumber(int n){
        if(map.contains(n)) return true;
        boolean prime = isPrime(n);
        if(prime) map.add(n);

        return prime;
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n == 2) return true;

        if(n %2 == 0) return false;

        for(int i = 3; i <= n/2; i++){
            if(n%i == 0) return false;
        }

        return true;
    }
    static void findPermutations(String s, List<Integer> res, List<List<Integer>> ways){
        if(s.length() == 0) {
            ways.add(new ArrayList<>());
            System.out.println(res.toString());
        }

        for(int i = 0; i < s.length(); ++i){
            String numStr = s.substring(0, i+1);
            int num = Integer.parseInt(numStr);
            boolean prime = primeNumber(num);
            if(prime){
                res.add(num);
                findPermutations(s.substring(i+1), res, ways);
                res.remove(res.size()-1);
            }
        }
    }

    static int findWays(String num){
        List<List<Integer>> way = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        findPermutations(num, res, way);

        return way.size();
    }

    public static void main(String args[]){
        System.out.print(findWays("11373"));
    }

}
