package AmazonQuestions;
import java.util.*;
public class kClosestPointsToOrigin {
    //O()
    static int[][] kClosest(int [][] points, int k){
        if(k == points.length) return points;

        PriorityQueue<int []> pq = new PriorityQueue<>(k , new Comparator<int []>(){
            public int compare(int[] a, int []b){
                return (b[0]*b[0] - b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]);
            }
        });

        for(int[] p : points){
            pq.add(p);
            if(pq.size()>k) pq.poll();
        }

        return pq.toArray(new int[0][0]);
    }
    public static void main(String args[]){

    }
}
