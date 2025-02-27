package easy;

public class FindValueOfVariableAfterPerformingOperations2011 {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for (String operation : operations) {
            if(operation.charAt(1) == '+') count++;
            else count--;
        }
        return count;
    }
}
