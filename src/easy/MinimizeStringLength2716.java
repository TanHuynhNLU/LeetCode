package easy;

public class MinimizeStringLength2716 {
    public int minimizedStringLength(String s) {
        boolean[] visited = new boolean[26];
        int ans = 0;
        for(char c : s.toCharArray()){
            if(visited[c - 'a'] == false){
                ans++;
                visited[c - 'a'] = true;
            }
        }
        return ans;
    }
}
