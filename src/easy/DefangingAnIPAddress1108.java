package easy;

public class DefangingAnIPAddress1108 {
    public String defangIPaddr(String address) {
      StringBuilder sb = new StringBuilder();
      char[] chars = address.toCharArray();
        for (char c : chars){
            if(c=='.') sb.append("[.]");
            else sb.append(c);
        }
        return sb.toString();
    }
}
