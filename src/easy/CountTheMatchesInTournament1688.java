package easy;

public class CountTheMatchesInTournament1688 {
    public static int numberOfMatches(int n) {
        int count = 0;
        while (n != 1) {
            count += (int) Math.floor((double) n / 2);  
            n = (int) Math.ceil((double) n / 2);

        }
        return count;
    }

    public static void main(String[] args) {
        numberOfMatches(7);
    }
}
