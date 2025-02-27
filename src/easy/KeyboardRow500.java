package easy;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        List<String> result = new ArrayList<>();
        for (int i = 0; i <words.length ; i++) {
            char[] tmp = words[i].toLowerCase().toCharArray();
            String row="";
            if(firstRow.indexOf(tmp[0])!=-1){
                row = firstRow;
            }
            if(secondRow.indexOf(tmp[0])!=-1){
                row = secondRow;
            }
            if(thirdRow.indexOf(tmp[0])!=-1){
                row = thirdRow;
            }
            boolean isRow = true;
            for (char c:tmp){
                if(row.indexOf(c)==-1) {
                    isRow=false;
                    break;
                }
            }
            if(isRow) result.add(words[i]);
        }
        String[] rs = new String[result.size()];
        for (int i = 0; i < rs.length; i++) {
            rs[i] = result.get(i);
        }
        return rs;
    }
}
