package easy;

public class ThousandSeparator1556 {
    public String thousandSeparator(int n) {
        if(n==0) return "0";
        StringBuilder sb = new StringBuilder();
        int count =0;
        while (n!=0){
            count++;
            sb.append(n%10);
            n/=10;
            if(count==3&&n!=0) {
                sb.append(".");
                count=0;
            }
        }
        return sb.reverse().toString();
    }
}
