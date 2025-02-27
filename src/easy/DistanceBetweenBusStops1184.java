package easy;

public class DistanceBetweenBusStops1184 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dClockWise = 0;
        int dCounterClockWise = 0;
        for (int i = start; i != destination; ) {
            dClockWise += distance[i];
            i = (i + 1) % distance.length;
        }
        for (int i = destination; i != start; ) {
            dCounterClockWise += distance[i];
            i = (i + 1) % distance.length;
        }
        return Math.min(dClockWise, dCounterClockWise);
    }
}
