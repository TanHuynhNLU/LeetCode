package easy;

public class ConstructTheRectangle492 {
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];
        for (int w = (int) Math.sqrt(area); w > 0; w--) {
           if(area%w==0){
               result[0] = area/w;
               result[1] = w;
               break;
           }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(constructRectangle(37));
    }
}
