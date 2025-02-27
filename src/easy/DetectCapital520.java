package easy;

public class DetectCapital520 {
    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) return true;
        int count = 0;
        int i = 1;
        if (Character.isLowerCase(word.charAt(0))) count = 2;
        else if (Character.isLowerCase(word.charAt(1))) {
            count = 3;
            i = 2;
        } else {
            count = 1;
            i = 2;
        }
        for (; i < word.length(); i++) {
            switch (count) {
                case 1:
                    if (Character.isLowerCase(word.charAt(i))) return false;
                    break;
                case 2:
                case 3:
                    if (!Character.isLowerCase(word.charAt(i))) return false;
                    break;
            }
        }
        return true;
//        Best solution
//        if(word.length()==1) return true;
//        if(word.charAt(0)>=97)//small letter - > all further small
//        {
//            for(int i=1;i<word.length();i++)
//            {
//                if((int)word.charAt(i)<97)
//                    return false;
//            }
//        }
//        else//0th letter is caps letter - > all further same
//        {
//            int seq = (int)word.charAt(1);
//            if(seq>=97)
//                for(int i=1;i<word.length();i++)
//                {
//                    if((int)word.charAt(i)<97)
//                        return false;
//                }
//            else
//                for(int i=1;i<word.length();i++)
//                {
//                    if((int)word.charAt(i)>90)
//                        return false;
//                }
//
//        }
//        return true;
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
    }
}
