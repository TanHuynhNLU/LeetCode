package testAlgorithm;

import java.util.*;

public class Test {
    public void add3(Integer i) {
        int val = i.intValue();
        val += 3;
        i = new Integer(val);
    }


    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");
        Double d = 9.0;
        Float f = 9.0F;
        System.out.print(f.equals(d) +"" );
        System.out.print(s1=s2+ "");
        System.out.print(s1.equals(s2) +"");

    }
}

