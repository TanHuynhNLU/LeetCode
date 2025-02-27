package easy;

import java.util.ArrayList;
import java.util.List;

public class OccurrencesAfterBigram1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] splitText = text.split(" ");
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < splitText.length-2; i++) {
            if(splitText[i].equals(first)&&splitText[i+1].equals(second)){
                tmp.add(splitText[i+2]);
            }
        }
        String[] res = new String[tmp.size()];
        for (int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            i+=2;
            System.out.println(i);
        }
    }
}
