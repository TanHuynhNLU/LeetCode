package easy;

public class DetermineColorOfAChessboardSquare1812 {
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0) -'a')%2==0&&(Character.getNumericValue(coordinates.charAt(1)) % 2) == 0)
                ||((coordinates.charAt(0) -'a')%2==1&&(Character.getNumericValue(coordinates.charAt(1)) % 2) == 1);
    }
}
