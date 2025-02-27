package easy;

public class TotalDistanceTraveled2739 {
    public int distanceTraveled(int mainTank, int additionalTank) {
        if (mainTank < 5) return mainTank * 10;
        else {
            int div = (mainTank - 5) / 4;
            return (mainTank + Math.min(div + 1, additionalTank)) * 10;
        }
    }
}
