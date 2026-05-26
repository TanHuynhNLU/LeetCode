package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFileInSystem609 {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] split = path.split(" ");
            for (int i = 1; i < split.length; i++) {
                String key = split[i].substring(split[i].indexOf("("));
                List<String> value = map.getOrDefault(key, new ArrayList<>());
                value.add(split[0] + "/" + split[i].substring(0,split[i].indexOf("(")));
                map.put(key, value);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for (List<String> list : map.values()) {
            if (list.size() > 1) {
                res.add(list);
            }
        }
        return res;
    }
    // Best solution
//    public List<List<String>> findDuplicate(String[] paths) {
//        Map<String, List<String>> contMap = new HashMap<>();
//        StringBuilder pathfile = new StringBuilder();
//        for (String pStr : paths) {
//            int i = 0;
//            pathfile.setLength(0);
//            while (pStr.charAt(i) != ' ') i++;
//            pathfile.append(pStr.substring(0,i)).append('/');
//            int pLen = ++i;
//            for (int j = i, k = 0; i < pStr.length(); i++)
//                if (pStr.charAt(i) == '(') {
//                    pathfile.append(pStr.substring(j,i));
//                    k = i + 1;
//                } else if (pStr.charAt(i) == ')') {
//                    String cont = pStr.substring(k, i);
//                    if (!contMap.containsKey(cont))
//                        contMap.put(cont, new ArrayList<>());
//                    contMap.get(cont).add(pathfile.toString());
//                    j = i + 2;
//                    pathfile.setLength(pLen);
//                }
//        }
//        List<List<String>> ans = new ArrayList<>();
//        for (List<String> v : contMap.values())
//            if (v.size() > 1) ans.add(v);
//        return ans;
//    }
}
