package medium;

public class RedundantConnection684 {
    int[] parents;

    public int[] findRedundantConnection(int[][] edges) {
        parents = new int[edges.length + 1];
        for (int i = 0; i < parents.length; i++) {
            parents[i] = i;
        }
        for (int[] edge : edges) {
            if (!union(edge[0], edge[1])) return edge;
        }
        return null;
    }

    public int find(int i) {
        if (parents[i] == i) return i;
        return find(parents[i]);
    }

    public boolean union(int i, int j) {
        int irep = find(i);
        int jrep = find(j);
        if (irep == jrep) return false;
        parents[irep] = jrep;
        return true;
    }
}
