package easy;

public class DeleteCharactersToMakeFancyString1957 {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char prev = ' ';
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == prev) {
                if(count==2){
                    continue;
                }
                count++;
            }
            else {
                prev=c;
                count=1;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
