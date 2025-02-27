package easy;

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        int[] cash = new int[2];
        for (int i = 0; i < bills.length; i++) {
            if(bills[i]==5){
                cash[0]++;
            }
            else if(bills[i]==10){
                if(cash[0]>0){
                   cash[0]--;
                   cash[1]++;
                }
                else return false;
            }
            else if(bills[i]==20){
                if((cash[1]>0&&cash[0]>0)){
                    cash[1]--;
                    cash[0]--;
                }
                else if(cash[0]>=3){
                    cash[0]-=3;
                }
                else return false;
            }
        }
        return true;
    }
//    Best Solution
//int b5 = 0;
//    int b10 = 0;
//    int b20 = 0;
//        for (int i  : bills) {
//        switch(i) {
//            case 5 -> b5++;
//            case 10 -> {
//                b10++;
//                if (b5 == 0) {
//                    return false;
//                } else {
//                    b5--;
//                };
//            }
//            case 20 -> {
//                b20++;
//                if (b5 <= 0) {
//                    return false;
//                } else {
//                    if (b10 == 0) {
//                        if (b5 < 3) {
//                            return false;
//                        } else {
//                            b5 -= 3;
//                        }
//                    } else {
//                        b10--;
//                        b5--;
//                    }
//                }
//
//            }
//        }
//    }
//        return true;
}
