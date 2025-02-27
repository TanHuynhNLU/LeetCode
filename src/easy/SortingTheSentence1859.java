package easy;

public class SortingTheSentence1859 {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for(String w:words){
            int num = Integer.parseInt(w.substring(w.length()-1));
            sorted[num-1] = w.substring(0, w.length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(String w:sorted){
            sb.append(w);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
