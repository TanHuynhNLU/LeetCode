package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            boolean isPlus = false;
            String[] splitEmail = email.split("@");
            for (char c : splitEmail[0].toCharArray()) {
                if (c == '.') continue;
                if (c == '+') isPlus = true;
                if (isPlus) continue;
                sb.append(c);
            }
            sb.append("@").append(splitEmail[1]);
            uniqueEmails.add(sb.toString());
        }
        return uniqueEmails.size();
//        Best Solution
//        Set<String> validEmails = new HashSet<>();
//        public int numUniqueEmails(String[] emails) {
//
//            for(int emailIndex=0; emailIndex < emails.length; emailIndex++)
//                addEmails(emails[emailIndex]);
//
//            return validEmails.size();
//        }
//
//        private void addEmails(String email) {
//            boolean atFound = false;
//            char[] emailLetters =  email.toCharArray();
//            int lastIndex, index;
//            for(index = 0, lastIndex=0; index < emailLetters.length; index++) {
//                if(!atFound) {
//                    if(emailLetters[index] == '.')
//                        continue;
//
//                    if(emailLetters[index] == '+') {
//                        while(emailLetters[++index] != '@');
//                        atFound = true;
//                    } else if(emailLetters[index] == '@')
//                        atFound = true;
//                }
//
//                emailLetters[lastIndex++] = emailLetters[index];
//            }
//            validEmails.add(String.valueOf(emailLetters, 0, lastIndex));
//        }
//    }
    }
}
