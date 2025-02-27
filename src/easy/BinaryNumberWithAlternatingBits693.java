package easy;

public class BinaryNumberWithAlternatingBits693 {
    public boolean hasAlternatingBits(int n) {
        int count = n%2==0?1:0;
        double sum = 0;
        while (sum<n){
            sum+=Math.pow(2,count);
            count+=2;
            if(sum==n) return true;
        }
        return false;
    }
    public static int calcSum(){
        int sum =0;
        int count=0;
        while (count<=30){
            sum+= Math.pow(2,count);
            count+=2;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println( calcSum());
    }
}
