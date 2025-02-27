package easy;

public class PassThePillow2582 {
    public int passThePillow(int n, int time) {
        if (Math.ceil((double) time / (n - 1)) % 2 == 1)return time % (n - 1) == 0 ? n : 1 + time % (n - 1);
        else return time % (n - 1) == 0 ? 1 : n - (time % (n - 1));
    }
}
