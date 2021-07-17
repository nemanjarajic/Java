package AmazonQuestions.OA2;

import java.util.Arrays;

public class stringToPrime2 {

    static int MOD = 1000000007;
    //Sieve approach to calculating all primes up to a given limit
    static boolean [] primeNums = new boolean[1000000];

    static void buildArr(){
        //Fill all values of array with true
        Arrays.fill(primeNums,true);

        // 0 and 1 are not prime numbers
        primeNums[0] = false;
        primeNums[1] = false;

        //Loop while the multiples of i is less than 1000000
        for(int i =2; i*i < 1000000; i++){
            //If the value of i is a prime number we want to make sure all its multiples are set to false;
            if(primeNums[i] == true){
                //Sets all multiples to false
                for(int j = i*i; j< 1000000; j+=i){
                    primeNums[j] = false;
                }
            }
        }
    }

    //Returns a boolean value based on the array of prime numbers constructed
    static boolean isPrime(String num){
        //The number is passed as a string then parsed to an integer
        int n = Integer.parseInt(num);
        return primeNums[n];
    }

    //Function to find the number of ways to spilt the string into prime numbers
    static int countWays(String num, int n, int []dp){
        if(dp[n] != -1) return dp[n];

        int count = 0;

        for(int i = 1; i <= 6; i++){
            //Edge case for leading 0s
            //checks to see whether number is prime
            if(n -i >= 0 && num.charAt(n-i) != '0' && isPrime(num.substring(n-i,n))){
                count += countWays(num, n-i, dp);
                count %= MOD;
            }
        }

        return dp[n] = count;
    }
    
    //Using memoization
    //Dp stores the way to split the first i digits of the string
    static int countPrimes(String s){
        int n = s.length();
        int []dp =  new int[n+1];
        Arrays.fill(dp, -1);
        dp[0]= 1;

        return countWays(s,n,dp);
    }
    
    //O(N+Nlog(log(N))) Time
    //O(N) Space

    public static void main(String[] args) {
        buildArr();
        System.out.print(countPrimes("11373"));
    }
}
