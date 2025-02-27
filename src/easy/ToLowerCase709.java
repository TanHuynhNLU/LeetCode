package easy;

public class ToLowerCase709 {
    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        for (char c:s.toCharArray()){
            if(c<=90&&c>=65) c+=32;
            res.append(c);
        }
        return res.toString();
    }
}
