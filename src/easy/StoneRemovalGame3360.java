package easy;

public class StoneRemovalGame3360 {
    public boolean canAliceWin(int n) {
        boolean isAliceTurn = true;
        int sub = 10;
        while (n > 0 && sub > 0) {
            if (n - sub < 0) return !isAliceTurn;
            isAliceTurn = !isAliceTurn;
            n -= sub;
            sub--;
        }
        return !isAliceTurn;
    }
}
