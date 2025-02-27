package easy;

public class FindTheWinningPlayerInCoinGame3222 {
    public String winningPlayer(int x, int y) {
        int n = Math.min(x, y / 4);
        return n % 2 == 0 ? "Bob" : "Alice";
    }
}
