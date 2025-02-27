package easy;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class RemoveLetterToEqualizeFrequency2423 {
    public static boolean equalFrequency(String word) {
        int[] freq = new int[26];
        for(char c : word.toCharArray()){
            freq[c - 'a']++;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        int max = 0;
        int maxValue=-1;
        for(int i : freq){
            if(i==0) continue;
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i)>max){
                max = map.get(i);
                maxValue = i;
            }
        }
        if(map.size()==1&&(maxValue==1||map.get(maxValue)==1)) return true;
        if(map.size()==2) {
            Iterator<Integer> it = map.keySet().iterator();
            int firstKey = it.next();
            int secondKey = it.next();
            if(firstKey==1 &&map.get(firstKey)==1) return true;
            if(secondKey!=firstKey+1) return false;
            else if(map.get(secondKey)==1) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        equalFrequency("abcc");
    }
}
