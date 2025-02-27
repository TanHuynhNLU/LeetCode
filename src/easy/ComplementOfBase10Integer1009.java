package easy;

public class ComplementOfBase10Integer1009 {
    public static int bitwiseComplement(int n) {
        int a = 0;
        for (int i = 0; i < 32; i++) {
            a+=Math.pow(2,i);
            if(a>=n) break;
        }
        return n^a;
    }

    public static void main(String[] args) {
        System.out.println(bitwiseComplement(5));
    }
}
