package easy;

public class ConvertANumberToHexadecimal405 {
    public static String toHex(int num) {
        if(num==0) return "0";
        char[] chars = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder builder = new StringBuilder();
        while (num!=0){
            char hex = chars[num&15];
            builder.append(hex);
            num>>>=4;
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(toHex(-1));
    }
}
