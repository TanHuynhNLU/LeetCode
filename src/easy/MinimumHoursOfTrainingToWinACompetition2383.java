package easy;

public class MinimumHoursOfTrainingToWinACompetition2383 {
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int sum = 0;
        int res = 0;
        for (int i = 0; i < energy.length; i++) {
            sum += energy[i];
        }
        if (sum >= initialEnergy)
            res += sum - initialEnergy + 1;
        for (int i = 0; i < experience.length; i++) {
            if (experience[i] >= initialExperience) {
                res += experience[i] - initialExperience + 1;
                initialExperience = experience[i] * 2 + 1;
            } else {
                initialExperience += experience[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        minNumberOfHours(5, 3, new int[]{1, 4}, new int[]{2, 5});
    }
}
