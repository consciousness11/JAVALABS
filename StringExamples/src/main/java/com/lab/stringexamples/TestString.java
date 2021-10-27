/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lab.stringexamples;

/**
 *
 * @author Marut
 */
public class TestString {

    public static void main(String[] args) {
//        char ch[] = {'a', 'p', 'p', 'l', 'e'};
//        String str = new String(ch);
//        
//        System.out.println("Length is " + str.length());
//        System.out.println("Character is " + str.charAt(2));
//
//        String s = "This is a demo of the getChars method.";
//        int start = 11;
//        int end = 14;
//       // char buf[] = new char[end - start];
//       char buf[] = {'a', 'p', 'p', 'l', 'e'};
//        s.getChars(start, end, buf, 0);
//        System.out.println(buf);
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLo";
        //System.out.println("value "+s1.compareTo(s4));
//        System.out.println(s1 + " equals " + s2 + " -> "
//                + s1.equals(s2));
//        System.out.println(s1 + " equals " + s3 + " -> "
//                + s1.equals(s3));
//        System.out.println(s1 + " equals " + s4 + " -> "
//                + s1.equals(s4));
//        System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> "
//                + s1.equalsIgnoreCase(s4));
//        String s1 = "Hello";
//        String s2 = new String(s1);
//        System.out.println(s1 + " equals " + s2 + " -> "
//                + s1.equals(s2));
//        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));

        String str = "85";
        int a = Integer.parseInt(str);
        System.out.println(a);
         double d = 78.90;
         String doub = String.valueOf(d);
         System.out.println("Value is "+d);
    }
}
