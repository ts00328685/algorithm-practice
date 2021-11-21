package com.heloword.practice.fundamental;

public class StringTest {
    public static void main(String[] args) {


        String s1 = new StringBuilder("123").append("456").toString();
        System.out.println(s1);
        System.out.println(s1.intern());
        System.out.println(s1 == s1.intern());

        // only "java" will be false???
        // JVM by default already loaded "java" in the String pool when loading
        // sun.misc.Version
        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2);
        System.out.println(s2.intern());
        System.out.println(s2 == s2.intern());


    }

}
