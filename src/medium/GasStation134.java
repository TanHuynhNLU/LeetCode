package medium;

public class GasStation134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            if (i >= 1 && gas[i] == gas[i - 1] && cost[i] == cost[i - 1]) continue;
            if (gas[i] >= cost[i] && helper(gas, cost, i)) {
                return i;
            }
        }
        return -1;
    }

    public boolean helper(int[] gas, int[] cost, int start) {
        int n = gas.length;
        int i = start;
        int tank = gas[start];
        do {
            tank -= cost[i];
            if (tank >= 0) {
                tank += gas[(i + 1) % n];
                i = (i + 1) % n;
            } else return false;
        }
        while (i != start);
        return true;
    }

    //    Popular Solution
//    public int canCompleteCircuit(int[] gas, int[] cost) {
//        int sumGas = 0, sumCost = 0;
//
//        for (int i = 0; i < gas.length; i++) {
//            sumGas = sumGas + gas[i];
//            sumCost = sumCost + cost[i];
//        }
//
//        if (sumGas < sumCost) {
//            return -1;
//        }
//
//        int total = 0, result = 0;
//
//        for (int i = 0; i < gas.length; i++) {
//            total = total + gas[i] - cost[i];
//
//            if (total < 0) {
//                total = 0;
//                result = i + 1;
//            }
//        }
//        return result;
//    }


    public static void main(String[] args) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};

        //System.out.println(helper(gas, cost, 4));
    }
}
