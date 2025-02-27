package easy;

public class CheckIfTwoChessboardSquaresHaveTheSameColor3274 {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int x1 = coordinate1.charAt(0);
        int y1 = coordinate1.charAt(1);
        int x2 = coordinate2.charAt(0);
        int y2 = coordinate2.charAt(1);
        if (Math.abs(x1 - x2) % 2 == 0 && Math.abs(y1 - y2) % 2 == 0) return true;
        if (Math.abs(x1 - x2) % 2 != 0 && Math.abs(y1 - y2) % 2 != 0) return true;
        return false;
    }
}
