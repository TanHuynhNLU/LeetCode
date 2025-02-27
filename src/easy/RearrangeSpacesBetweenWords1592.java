package easy;

public class RearrangeSpacesBetweenWords1592 {
    public static String reorderSpaces(String text) {
        int countSpace = 0;
        for (char c : text.toCharArray()) {
            if(c==' ') countSpace++;
        }
        if(countSpace==0) return text;
        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        if(words.length==1) return sb.append(words[0]).append(" ".repeat(countSpace)).toString();
        int nSpace = countSpace/(words.length-1);

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if(i!= words.length-1) sb.append(" ".repeat(nSpace));
        }

        sb.append(" ".repeat(countSpace%(words.length-1)));
        return sb.toString();
    }
// Best solution
//    public String reorderSpaces(String text) {
////        if(text.length() ==1) return text;
//        int count =  0;
//        int word = 0;
//        boolean isSpace = false;
//        for(char c : text.toCharArray()) {
//            if(c == ' '){
//                count++;
//                isSpace = false;
//            }
//            else if(!isSpace){
//                word++;
//                isSpace = true;
//            }
//
//        }
//
//        int spaceCount = 0;
//        if(word > 1){
//            spaceCount = count/(word-1);
//        }
//
//
//        StringBuilder b = new StringBuilder();
//        boolean spaceFlag = false;
//        for(char c : text.trim().toCharArray()) {
//            if(c != ' '){
//                b.append(c);
//                spaceFlag = true;
//            } else if(spaceFlag) {
//                for(int i = 0 ;i < spaceCount; i++){
//                    b.append(' ');
//                    count--;
//                }
//                spaceFlag = false;
//            }
//        }
//
//        while(count > 0){
//            b.append(' ');
//            count--;
//        }
//
//        return b.toString();
//    }

    public static void main(String[] args) {
        reorderSpaces("  this   is  a sentence ");
    }
}
