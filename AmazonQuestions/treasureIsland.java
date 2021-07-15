package AmazonQuestions;
import java.util.*;


public class treasureIsland {
    static class Coordinate{
        int x,y;

        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    static int treasureIs(char [][] island){
        int res = 0;

        if(island == null || island.length == 0) return res;

        Queue<Coordinate> q = new LinkedList<>();

        q.add(new Coordinate(0,0));
        boolean [][] visited = new boolean[island.length][island[0].length];
        visited[0][0] = true;

        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while(q.size() != 0){
            int size = q.size();

            for(int i = 0; i < size; i++){
                Coordinate c = q.poll();
                int x = c.x;
                int y = c.y;

                if(island[x][y] == 'X') return res;

                for(int[] d: dirs){
                    int newX = x + d[0];
                    int newY = y + d[1];

                    if(newX >= 0 && newY >=0 && newX < island.length && newY < island[0].length && island[newX][newY] != 'D' && !visited[newX][newY]){
                        q.add(new Coordinate(newX, newY));
                        visited[newX][newY] = true;
                    }
                }
            }
            res++;
        }

        return 0;

    }

    public static void main(String args[]){
        char [][] island = new char[][] {{'O', 'O', 'O', 'O'},
        {'D', 'O', 'D', 'O'},
        {'O', 'O', 'O', 'O'},
        {'X', 'D', 'D', 'O'}};

        System.out.print(treasureIs(island));
    }
}
