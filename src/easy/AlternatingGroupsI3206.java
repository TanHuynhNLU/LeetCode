package easy;

public class AlternatingGroupsI3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int res = 0;
        int n = colors.length;
        for (int i = 0; i < n; i++) {
            int prev = (i - 1 + n) % n;
            int next = (i + 1 + n) % n;
            if (colors[i] != colors[prev] && colors[i] != colors[next]) res++;
        }
        return res;
    }
}
