package sampleproblems;

public class stringCompression {
    static int compress(char [] c){
        int res = 0;
        int i = 0;
        while(i < c.length){
            char l =  c[i];
            int count = 0;
            while(i < c.length && l == c[i]){
                i++;
                count++;
            }
            c[res] = l;
            res++;

            if(count > 1){
                char arr[] = Integer.toString(count).toCharArray();
                for(char t:arr){
                    c[res] = t;
                    res++;
                }
            }
        }

        return res;

    }
    public static void main(String args[]){

    }
}
