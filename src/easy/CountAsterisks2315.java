package easy;

public class CountAsterisks2315 {
    public int countAsterisks(String s) {
        boolean isBetween = false;
        int count = 0;
        for(char c: s.toCharArray()) {
            if(c=='|') isBetween = !isBetween;
            if(!isBetween&&c=='*') count++;
        }
        return count;
    }
}
