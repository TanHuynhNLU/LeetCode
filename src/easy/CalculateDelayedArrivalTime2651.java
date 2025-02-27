package easy;

public class CalculateDelayedArrivalTime2651 {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
    }
}
