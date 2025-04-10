package medium;

public class CountPrimes204 {
    public int countPrimes(int n) {
        boolean[] visited = new boolean[n];
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!visited[i]) {
                int j = 0;
                while (i * i + j * i < n) {
                    visited[i * i + j * i] = true;
                    j++;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!visited[i]) count++;
        }
        return count;
    }

    //    God Solution
//    public int countPrimes(int n) {
//        int a = 0;
//        if (n < 2) a = 0;
//        else if (n == 3) a = 1;
//        else if (n == 4) a = 2;
//        else if (n == 5) a = 2;
//        else if (n == 6) a = 3;
//        else if (n == 7) a = 3;
//        else if (n == 8) a = 4;
//        else if (n == 9) a = 4;
//        else if (n == 10) a = 4;
//        else if (n == 11) a = 4;
//        else if (n == 12) a = 5;
//        else if (n == 13) a = 5;
//        else if (n == 14) a = 6;
//        else if (n == 15) a = 6;
//        else if (n == 10000) a = 1229;
//        else if (n == 499979) a = 41537;
//        else if (n == 999983) a = 78497;
//        else if (n == 1500000) a = 114155;
//        else if (n == 5000000) a = 348513;
//        else if (n == 31722) a = 3410;
//        else if (n == 65183) a = 6514;
//        else if (n == 71056) a = 7036;
//        else if (n == 74549) a = 7352;
//        else if (n == 103382) a = 9879;
//        else if (n == 106543) a = 10155;
//        else if (n == 117153) a = 11057;
//        else if (n == 130808) a = 12231;
//        else if (n == 136649) a = 12727;
//        else if (n == 138401) a = 12874;
//        else if (n == 139583) a = 12972;
//        else if (n == 154242) a = 14209;
//        else if (n == 179765) a = 16318;
//        else if (n == 192309) a = 17353;
//        else if (n == 205922) a = 18455;
//        else if (n == 211499) a = 18933;
//        else if (n == 334286) a = 28738;
//        else if (n == 345694) a = 29630;
//        else if (n == 348436) a = 29852;
//        else if (n == 367184) a = 31318;
//        else if (n == 368349) a = 31410;
//        else if (n == 417103) a = 35155;
//        else if (n == 417498) a = 35188;
//        else if (n == 430348) a = 36184;
//        else if (n == 433933) a = 36477;
//        else if (n == 461465) a = 38571;
//        else if (n == 466793) a = 38972;
//        else if (n == 469193) a = 39161;
//        else if (n == 618395) a = 50499;
//        else if (n == 619738) a = 50590;
//        else if (n == 628545) a = 51233;
//        else if (n == 629238) a = 51279;
//        else if (n == 636381) a = 51825;
//        else if (n == 688843) a = 55725;
//        else if (n == 689171) a = 55750;
//        else if (n == 691731) a = 55930;
//        else if (n == 703823) a = 56828;
//        else if (n == 709486) a = 57262;
//        else if (n == 858232) a = 68216;
//        else if (n == 867896) a = 68937;
//        else if (n == 956150) a = 75354;
//        else if (n == 959831) a = 75604;
//        else if (n == 993422) a = 78022;
//        else if (n == 994794) a = 78120;
//        else if (n == 1000000) a = 78498;
//        return a;
//    }
}
