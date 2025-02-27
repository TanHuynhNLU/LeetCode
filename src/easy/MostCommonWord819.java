package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MostCommonWord819 {
    public String mostCommonWord(String paragraph, String[] banned) {
        int max = 0;
        String res="";
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> bannedWords = new HashSet<>();
        for (String s : banned){
            bannedWords.add(s);
        }
        for(String s : paragraph.split("[\\p{Punct}\\s]+")){
            String tmp = s.toLowerCase();
            if(!bannedWords.contains(tmp)){
                if(map.containsKey(tmp)){
                    int value = map.get(tmp);
                    map.put(tmp,value+1);
                    if(value+1>max){
                        max = value+1;
                        res = tmp;
                    }
                }else {
                    map.put(tmp,1);
                    if(max==0){
                        max =1;
                        res =tmp;
                    }
                }
            }
        }
        return res;
    }
}
