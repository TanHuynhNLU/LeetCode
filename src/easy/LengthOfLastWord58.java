package easy;

public class LengthOfLastWord58 {
    public static int lengthOfLastWords(String s){
       String [] splitString = s.trim().split(" ");
       return splitString[splitString.length-1].length();

       //Best Solution
//        s = s.trim();
//        if(s.indexOf(' ')==-1)
//            return s.length();
//        return s.substring(s.lastIndexOf(' ')).length()-1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWords("Hello   Word"));
    }
}
