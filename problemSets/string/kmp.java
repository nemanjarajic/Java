package string;

public class kmp {
    public static void main(String[] args) {
        String pattern = "erf";
        String s = "sadbajerfsdfs";

        System.out.print(kmpAlgo(pattern,s));
    }

    static boolean kmpAlgo(String pattern, String s){
        int n = pattern.length();
        int m = s.length();

        int lps[] = new int[n];
        makeLPS(pattern, n, lps);

        int i = 0;
        int j = 0;
        while(i < m){
            if(pattern.charAt(j) == s.charAt(i)){
                i++;
                j++;
            }
            if(j == n){
                return true;
            }
            else if(i < m && pattern.charAt(j) != s.charAt(i)){
                if(j != 0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
            
        }

        return false;
    }

    static void makeLPS(String pattern, int n, int [] lps){
        //Length of previous longest prefix suffix
        int len = 0;
        int i = 1;

        //LPS at index 0 is always 0
        lps[0] = 0;

        while(i<n){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }
            //Pattern[i] != pattern[len]
            else{
                if(len != 0){
                    len = lps[len-1];
                }else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }
}
