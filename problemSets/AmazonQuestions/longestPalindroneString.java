package AmazonQuestions;

public class longestPalindroneString {
    
    //O(N) Time
    //O(1) Space
    static boolean isPalin(String s){
        int l = 0, h = s.length()-1;

        while(l <= h){
            if(s.charAt(l) != s.charAt(h)){
                return false;
            }
            l++;
            h--;
        }

        return true;
    }

    //O(N^3) Time
    //O(1) Space
    static String longestBrute(String s){
        int res = 0;
        String sol = "";
        for(int i = 0; i < s.length(); i++){
            String temp = "";
            temp += s.charAt(i);
            for(int j = i+1; j < s.length(); j++){
                temp += s.charAt(j);
                if(isPalin(temp)){
                    if(temp.length() > res){
                        sol = temp;
                        res = temp.length();
                    }
                }
            }
        }

        return sol;
    }

    static int expand(String s, int l, int r){
        if(s == null || l > r) return 0;

        while(l >= 0 && r< s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }

        return r - l - 1;
    }
    //Expand from the i
    //O(N^2) Time
    //O(1) Space
    static String longestImproved(String s){
        if( s.length() < 1) return "";

        int start = 0, end =0;

        for(int i = 0; i < s.length(); i++){
            int len1 = expand(s,i,i);
            int len2 = expand(s, i, i+1);
            int len = Math.max(len2, len1);

            if(len > end- start){
                start = i - ((len-1)/2);
                end = i + ((len)/2);
            }

        }

        return s.substring(start, end+1);

    }
    
    public static void main(String args[]){
        String t = "babad";

        System.out.println(longestImproved(t));
    }
}
