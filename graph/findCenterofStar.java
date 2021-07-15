package graph;

public class findCenterofStar {
    static int solution(int [][] edges){
        return edges[0][0] == edges[1][0] || edges[0][0] == edges [1][1]? edges[0][0]: edges[0][1];
    }

    public static void main(String[] args) {
        int [][] edges = new int [][]{{1,2},{2,3},{4,2}};

        System.out.print(solution(edges));
    }
}
