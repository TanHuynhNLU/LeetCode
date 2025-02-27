package easy;

public class CanPlaceFlowers605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1) {
            if(flowerbed[0]==0) return 1>=n;
            else return 0>=n;
        }
        int count = 0;
        int countZero = 0;
        boolean isFirstOne=false;
        for (int i = 0; i < flowerbed.length; i++) {
            if(count>=n) return true;
            if(!isFirstOne){
                if(flowerbed[i]==1){
                    isFirstOne=true;
                    count+=countZero/2;
                    countZero=0;
                }else {
                    countZero++;
                }
            }else {
                if(flowerbed[i]==1){
                    count+=(countZero-1)/2;
                    countZero=0;
                }else {
                    countZero++;
                }
            }
        }
        count+=countZero/2;
        if(!isFirstOne&&countZero%2==1) count++;
        return count>=n;
//        Best solution
//        int i=0;
//        int pos=0;
//        int l = flowerbed.length;
//        while(i<l)
//        {
//            if(flowerbed[i]==1)
//            {
//                i=i+2;
//            }
//            else
//            {
//                if(i==(l-1) && flowerbed[i]==0)
//                {
//                    pos++;
//                    i++;
//                }
//                else if(flowerbed[i+1]!=1)
//                {
//                    pos++;
//                    i=i+2;
//                }
//                else
//                {
//                    i=i+3;
//                }
//            }
//        }
//        if(n<=pos)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
    }
}
