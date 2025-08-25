package medium;

public class MinimumGeneticMutation433 {
    public int minMutation(String startGene, String endGene, String[] bank) {
        return dfs(startGene, endGene, bank, new boolean[bank.length], 0);
    }

    public int dfs(String startGene, String endGene, String[] bank, boolean[] visited, int count) {
        if (startGene.equals(endGene)) return count;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bank.length; i++) {
            if (!visited[i] && isMutation(startGene, bank[i])) {
                visited[i] = true;
                int res = dfs(bank[i], endGene, bank, visited, count + 1);
                visited[i] = false;
                if (res != -1)
                    min = Math.min(min, res);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public boolean isMutation(String firstGene, String secondGene) {
        boolean isMutation = false;
        for (int i = 0; i < 8; i++) {
            if (isMutation && firstGene.charAt(i) != secondGene.charAt(i)) return false;
            if (firstGene.charAt(i) != secondGene.charAt(i)) isMutation = true;
        }
        return isMutation;
    }

    //BFS Solution
//    public int minMutation(String startGene, String endGene, String[] bank) {
//        Queue<String> q = new LinkedList<String>();
//        HashMap<String, Integer> map = new HashMap<>();
//
//        for (String s : bank) {
//            map.put(s, -1);
//        }
//
//        q.add(startGene);
//        map.put(startGene, 0);
//
//        while (!q.isEmpty()) {
//            String curr = q.poll();
//            if (curr.equals(endGene))
//                return map.get(curr);
//
//            for (String s : bank) {
//                if (map.get(s) == -1 && diffOfCharacters(curr, s) == 1) {
//                    q.add(s);
//                    map.put(s, map.get(curr) + 1);
//                }
//            }
//        }
//
//        return -1;
//    }
//
//    public int diffOfCharacters(String a, String b) {
//        if (a.length() != b.length())
//            return -1;
//
//        int count = a.length();
//
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == b.charAt(i))
//                count--;
//        }
//
//        return count;
//    }
}
