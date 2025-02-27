package easy;

public class GoatLatin824 {
    public static String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(String word:sentence.split(" ")){
            sb.append("a");
            if(isVowel(word.charAt(0))){
                res.append(word).append("ma").append(sb).append(" ");
            }else {
                char c = word.charAt(0);
                String tmp = word.substring(1);
                res.append(tmp).append(c).append("ma").append(sb).append(" ");
            }
        }
        return res.toString().trim();
    }
    public static boolean isVowel(char c){
        return "AOIUEaoiue".indexOf(c)!=-1;
    }

    public static void main(String[] args) {
        System.out.println(toGoatLatin("I speak Goat Latin"));
    }
}
