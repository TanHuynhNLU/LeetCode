package easy;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary1491 {
    public double average(int[] salary) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        return (sum - min - max) / (salary.length - 2);
    }
}
