package easy;

public class AddDigits258 {
    public int addDigits(int num) {
        while (num>9){
            int sum = 0;
            while (num!=0){
                sum+=num%10;
                num/=10;
            }
            num = sum;
        }
        return num;

        //Best solution
//        if(num == 0) return 0;
//        else if(num % 9 == 0) return 9;
//        else return num % 9;
    }
}
