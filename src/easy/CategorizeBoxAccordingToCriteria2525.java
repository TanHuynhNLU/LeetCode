package easy;

public class CategorizeBoxAccordingToCriteria2525 {
    public static String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = false;
        boolean isHeavy = false;
        long volume = (long) length * width * height;
        if (mass >= 100) isHeavy = true;
        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) isBulky = true;

        if (isBulky && isHeavy) return "Both";
        if (!isBulky && !isHeavy) return "Neither";
        if (isBulky && !isHeavy) return "Bulky";
        if (!isBulky && isHeavy) return "Heavy";
        return "";
    }

    public static void main(String[] args) {
        categorizeBox(2909, 3968, 3272, 727);
    }
}
