package medium;

public class MagicalString481 {
    private int[] res;

    public MagicalString481() {
        init();
    }

    public void init() {
        res = new int[100000];
        int count = 1;
        int[] magicalString = new int[100000];
        magicalString[0] = 1;
        magicalString[1] = 2;
        magicalString[2] = 2;
        res[0] = 1;
        res[1] = 1;
        res[2] = 1;
        int curr = 2;
        int next = 3;
        while (next < 100000) {
            if (magicalString[curr] == 2) {
                if (magicalString[next - 1] == 1) {
                    magicalString[next] = 2;
                    res[next] = count;
                    next++;
                    magicalString[next] = 2;
                    res[next] = count;
                } else {
                    magicalString[next] = 1;
                    count++;
                    res[next] = count;
                    next++;
                    magicalString[next] = 1;
                    count++;
                    res[next] = count;
                }
            } else {
                if (magicalString[next - 1] == 1) {
                    magicalString[next] = 2;
                    res[next] = count;
                } else {
                    magicalString[next] = 1;
                    count++;
                    res[next] = count;
                }
            }
            curr++;
            next++;
        }
    }

    public int magicalString(int n) {
        return res[n - 1];
    }

    //Popular Solution
//    public int magicalString(int n) {
//        if (n <= 0) return 0;
//        if (n <= 3) return 1;
//        int[] a = new int[n + 2];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 2;
//        int head = 2, tail = 3, num = 1, ones = 1;
//        while (tail < n) {
//            int cnt = a[head++];
//            for (int i = 0; i < cnt && tail < n; i++) {
//                a[tail++] = num;
//                if (num == 1) ones++;
//            }
//            num = 3 - num;
//        }
//        return ones;
//    }

    //Best Solution
//    public int magicalString(int n) {
//        switch (n) {
//            case 1:     return 1;
//            case 2:     return 1;
//            case 3:     return 1;
//            case 4:     return 2;
//            case 5:     return 3;
//            case 6:     return 3;
//            case 7:     return 4;
//            case 8:     return 4;
//            case 9:     return 4;
//            case 10:    return 5;
//            case 11:    return 5;
//            case 12:    return 5;
//            case 13:    return 6;
//            case 14:    return 7;
//            case 15:    return 7;
//            case 16:    return 8;
//            case 17:    return 9;
//            case 18:    return 9;
//            case 19:    return 9;
//            case 20:    return 10;
//            case 21:    return 10;
//            case 22:    return 11;
//            case 23:    return 12;
//            case 24:    return 12;
//            case 25:    return 13;
//            case 26:    return 13;
//            case 27:    return 13;
//            case 28:    return 14;
//            case 29:    return 15;
//            case 30:    return 15;
//            case 31:    return 16;
//            case 32:    return 17;
//            case 188:   return 94;
//            case 256:   return 129;
//            case 526:   return 261;
//            case 712:   return 356;
//            case 1213:  return 609;
//            case 1227:  return 616;
//            case 1231:  return 617;
//            case 1777:  return 891;
//            case 2037:  return 1019;
//            case 3578:  return 1791;
//            case 4716:  return 2359;
//            case 5525:  return 2763;
//            case 5526:  return 2764;
//            case 5929:  return 2963;
//            case 8888:  return 4443;
//            case 9747:  return 4869;
//            case 9758:  return 4874;
//            case 9999:  return 4995;
//            case 11213: return 5605;
//            case 11227: return 5612;
//            case 11327: return 5664;
//            case 11800: return 5900;
//            case 12800: return 6398;
//            case 13800: return 6900;
//            case 14999: return 7501;
//            case 15000: return 7501;
//            case 15526: return 7766;
//            case 19999: return 9996;
//            case 20000: return 9996;
//            case 89999: return 44975;
//            case 99999: return 49972;
//            case 100000: return 49972;
//        }
//        return -1;
//    }
}
