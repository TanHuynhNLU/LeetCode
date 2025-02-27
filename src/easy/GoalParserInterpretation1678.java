package easy;

public class GoalParserInterpretation1678 {
    public String interpret(String command) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == '(') {
                if(command.charAt(i+1) == ')') {
                    sb.append('o');
                    i++;
                }else {
                    sb.append("al");
                    i+=3;
                }
            }
            else sb.append(command.charAt(i));
        }
        return sb.toString();
    }
}
