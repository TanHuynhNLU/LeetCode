package easy;

public class ReformatPhoneNumber1694 {
    public String reformatNumber(String number) {
        StringBuilder tmp = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                tmp.append(c);
            }
        }
        int i =0;
        for (; i < tmp.length()-4; i+=3) {
            res.append(tmp.charAt(i));
            res.append(tmp.charAt(i+1));
            res.append(tmp.charAt(i+2));
            res.append("-");
        }
        if(i==tmp.length()-4){
            res.append(tmp.charAt(i));
            res.append(tmp.charAt(i+1));
            res.append("-");
            res.append(tmp.charAt(i+2));
            res.append(tmp.charAt(i+3));
        }else {
            for (int j = i; j < tmp.length(); j++) {
                res.append(tmp.charAt(j));
            }
        }
        return res.toString();
    }
}
