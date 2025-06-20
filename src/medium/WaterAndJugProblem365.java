package medium;

public class WaterAndJugProblem365 {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x + y < target) return false;
        if (target == x * 2 || target == y * 2) return true;
        if (x == target || y == target || x + y == target) return true;
        int gcd = gcd(x, y);
        if (gcd == target) return true;
        if (x - gcd == target || y - gcd == target || x + y - gcd == target) return true;
        if (x + gcd == target || y + gcd == target || Math.abs(x - y) + gcd == target) return true;
        return false;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    //Best Solution: Bézout's identity
//    public boolean canMeasureWater(int x, int y, int z) {
//        //limit brought by the statement that water is finallly in one or both buckets
//        if(x + y < z) return false;
//        //case x or y is zero
//        if( x == z || y == z || x + y == z ) return true;
//
//        //get GCD, then we can use the property of Bézout's identity
//        return z%GCD(x, y) == 0;
//    }
//
//    public int GCD(int a, int b){
//        while(b != 0 ){
//            int temp = b;
//            b = a%b;
//            a = temp;
//        }
//        return a;
//    }
}
