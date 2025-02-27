package easy;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            boolean flag=true;
            int tmp = i;
            while (tmp!=0){
                int r = tmp%10;
                if (r==0||i%r!=0){
                    flag =false;
                    break;
                }
                tmp/=10;
            }
            if(flag) res.add(i);
        }
        return res;
    }

//    public List<Integer> selfDividingNumbers(int left, int right) {
//        List<Integer> list =new ArrayList<>();
//        for(int i=left;i<=right;i++){
//            if(check(i)){
//                list.add(i);
//            }
//        }
//        return list;
//    }
//    public static boolean check(int num){
//        int temp=num;
//        while(temp>0){
//            int rem=temp%10;
//            if(rem==0){
//                return false;
//            }
//            if(num%rem==0){
//                temp/=10;
//            }
//            else{
//                return false;
//            }
//        }
//        return true;
//    }
}
