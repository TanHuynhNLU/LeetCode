package easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if(i%3==0&&i%5==0)
                result.add("FizzBuzz");
            else if(i%3==0) result.add("Fizz");
            else if(i%5==0) result.add("Buzz");
            else result.add(""+ i);
        }
        return result;
//        Best Solution
//        return new AbstractList<>(){
//
//            @Override
//            public String get(int index){
//                return switch(++index % 15){
//                    case 0 -> "FizzBuzz";
//                    case 3, 6, 9, 12 -> "Fizz";
//                    case 5, 10 -> "Buzz";
//                    default -> String.valueOf(index);
//                };
//            }
//
//            @Override
//            public int size() {
//                return n;
//            }
    }
}
