package easy;

import java.util.*;

public class FindIfPathExistInGraph1971 {
    int[] parent ;
    public  boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        for (int i = 0; i <n; i++) {
            parent[i] = i;
        }
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }
        return find(source)==find(destination);
    }

    public int find(int i){
        if(i == parent[i]) return i;
        else return parent[i] = find(parent[i]);
    }
    public void union(int i, int j){
        parent[find(i)] = find(j);
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        FindIfPathExistInGraph1971 f = new FindIfPathExistInGraph1971();
        System.out.println(f.validPath(6,edges,0,5));
    }
}
