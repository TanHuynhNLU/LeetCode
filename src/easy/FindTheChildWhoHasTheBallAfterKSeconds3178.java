package easy;

public class FindTheChildWhoHasTheBallAfterKSeconds3178 {
    public int numberOfChild(int n, int k) {
       int div = k/(n-1);
       int r = k%(n-1);
       if(div%2==0){
           return r-1;
       }else {
           return n-1-r;
       }
    }
}
