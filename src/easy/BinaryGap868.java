package easy;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class BinaryGap868 {
    public int binaryGap(int n) {
        int max = 0;
        int count = 0;
        boolean isBit = false;
        while (n!=0){
            int bit = n&1;
            if(bit==1){
                if(isBit){
                    count++;
                    max = Math.max(max,count);
                    count=0;
                }else {
                    isBit =true;
                }
            }else {
                if(isBit) count++;
            }
            n>>>=1;
        }
        return max;
    }
}
