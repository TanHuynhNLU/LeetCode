package easy;

public class SlowestKey1629 {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        char[] charKeys = keysPressed.toCharArray();
        int maxDuration = releaseTimes[0];
        char key = charKeys[0];
        for (int i = 1; i < keysPressed.length(); i++) {
            int duration = releaseTimes[i]- releaseTimes[i-1];
            if(duration>maxDuration) {
                maxDuration = duration;
                key = charKeys[i];
            } else if (duration==maxDuration) {
                if(charKeys[i]>key) key = charKeys[i];
            }
        }
        return key;
    }

    public static void main(String[] args) {
        int[] arr= {10,19,20,21,22,32};
        String s = "abodzo";
        slowestKey(arr,s);
    }
}
