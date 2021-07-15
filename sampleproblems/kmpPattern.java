package sampleproblems;

public class kmpPattern {

    //O(n+m) time
    //O(m) space
    static boolean solution(String s, String pat){
        int[] lps = new int[pat.length()];
        boolean found = false;
        computeLPS(pat, pat.length(), lps);

        int i =0, j =0;

        while(i<s.length()){
            if(pat.charAt(j) == s.charAt(i)){
                i++;
                j++;
            }

            if(j == pat.length()){
                found = true;
                j = lps[j-1];
            }else if(i < s.length() && pat.charAt(j) != s.charAt(i)){
                if(j !=0) j = lps[j-1];
                else i+=1;
            }
        }

        return found;
    }

    static void computeLPS(String pat, int size, int lps[]){
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while(i < size){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = len;
                    i++;
                }
            }
        }
    }


    public static void main(String[] args) {
        String s1 = "abbdcfabcad";
        String s2 = "abca";

        System.out.print(solution(s1, s2));
    }
}
