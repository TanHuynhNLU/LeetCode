package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            ArrayList<String> list = (ArrayList<String>) map.getOrDefault(String.valueOf(chars), new ArrayList<>());
            list.add(str);
            map.put(String.valueOf(chars), list);
        }
        return new ArrayList<>(map.values());
    }

//    Best solution
//    private List<List<String>> ans;
//    public List<List<String>> groupAnagrams(String[] strs) {
//        return new AbstractList<List<String>>(){
//            public List<String> get(int index)
//            {
//                if(ans==null) init();
//                return ans.get(index);
//            }
//            public int size()
//            {
//                if(ans==null) init();
//                return ans.size();
//            }
//            public void init()
//            {
//                Map<String,List<String>> group=new HashMap<>();
//                for(String s:strs)
//                {
//                    int[] count=new int[26];
//                    StringBuffer sb=new StringBuffer();
//                    for(char c:s.toCharArray())
//                    {
//                        count[c-'a']++;
//                    }
//                    for(int i=0;i<26;i++)
//                    {
//                        if(count[i]!=0)
//                            sb.append('a'+i);
//                        sb.append(count[i]);
//                    }
//                    String key=sb.toString();
//                    group.computeIfAbsent(key,k->new ArrayList<String>()).add(s);
//                }
//                ans=new ArrayList<>(group.values());
//            }
//            //ans=new ArrayList<>(group.values());
//        };
//    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
