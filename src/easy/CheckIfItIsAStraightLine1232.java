package easy;

public class CheckIfItIsAStraightLine1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int type;
        double m = 0;
        if (coordinates[0][0] == coordinates[1][0]) type = 0;
        else if (coordinates[0][1] == coordinates[1][1]) type = 1;
        else {
            type = 2;
            m = (double)(coordinates[1][0] - coordinates[0][0]) /
                    (coordinates[1][1] - coordinates[0][1]);
        }

        if (type == 0) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != coordinates[i - 1][0]) return false;
            }
        }
        if (type == 1) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][1] != coordinates[i - 1][1]) return false;
            }
        }
        if (type == 2) {
            for (int i = 2; i < coordinates.length; i++) {
                if ((double) (coordinates[i][0] - coordinates[i-1][0]) /
                        (coordinates[i][1] - coordinates[i-1][1]) != m)
                    return false;
            }
        }
        return true;
    }
}
