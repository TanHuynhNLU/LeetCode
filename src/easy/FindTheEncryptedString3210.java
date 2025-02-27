package easy;

public class FindTheEncryptedString3210 {
    public String getEncryptedString(String s, int k) {
        int count = 0;
        int i = k % s.length();
        StringBuilder sb = new StringBuilder(s);
        while (count < s.length()) {
            sb.append(s.charAt(i % s.length()));
            i++;
            count++;
        }
        return sb.toString();
    }
}
