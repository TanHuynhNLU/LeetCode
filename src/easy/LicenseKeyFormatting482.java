package easy;

public class LicenseKeyFormatting482 {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c:s.toCharArray()) {
            if(c!='-'){
                sb.append(Character.toUpperCase(c));
            }
        }
        int r = sb.length()%k==0?k:sb.length()%k;
        for (;r<sb.length();r+=k+1){
            sb.insert(r,'-');
        }
        return sb.toString();

//        Best solution
//        byte[] sBytes = s.getBytes();
//        byte[] reformatted = new byte[2 * s.length() - 1];
//        int index = reformatted.length - 1;
//        int count = 0;
//
//        for (int i = sBytes.length - 1; i >= 0; i--) {
//            if (sBytes[i] != '-') {
//                if (count == k) {
//                    reformatted[index--] = '-';
//                    count = 0;
//                }
//                reformatted[index--] = (sBytes[i] >= 'a' && sBytes[i] <= 'z')
//                        ? (byte) (sBytes[i] - 32) : sBytes[i];
//                count++;
//            }
//        }
//        return new String(reformatted, index + 1, reformatted.length - index - 1);
    }

    public static void main(String[] args) {
        String s = "2-5g-3-J";
        System.out.println(licenseKeyFormatting(s,2));
    }
}
