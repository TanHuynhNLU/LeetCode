package easy;

public class ShortestDistanceToTargetStringInACircularArray2515 {
    public int closetTarget(String[] words, String target, int startIndex) {
        int min = words.length;
        boolean isFind = false;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                isFind = true;
                if(i==startIndex) return 0;
                if (i < startIndex) {
                    int right = words.length - startIndex - 1 + i + 1;
                    int left = startIndex - i;
                    int tmp = Math.min(left, right);
                    min = Math.min(min, tmp);
                }
                if (i > startIndex) {
                    int right = i - startIndex;
                    int left = startIndex + words.length - i;
                    int tmp = Math.min(left, right);
                    min = Math.min(min, tmp);
                }
            }
        }
        return isFind ? min : -1;
    }
}
