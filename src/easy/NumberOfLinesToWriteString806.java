package easy;

public class NumberOfLinesToWriteString806 {
    public int[] numberOfLines(int[] widths, String s) {
        int[] res = new int[2];
        int line =1;
        int count = 0;
        for (char c: s.toCharArray()) {
            if(count+widths[c-'a']>100){
                line++;
                count = widths[c-'a'];
            }else {
                count+=widths[c-'a'];
            }
        }
        res[0] = line;
        res[1] = count;
        return res;
    }
}
