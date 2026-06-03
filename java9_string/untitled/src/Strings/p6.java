package Strings;

import java.util.Arrays;

// string ke built in methods
public class p6 {
    public static void main(String[] args) {
      String x = "my Name is kalpesh";
        System.out.println("x.indexOf('a'): "+x.indexOf('a'));//4
        //used to return index
        System.out.println("x.indexOf('r'): "+x.indexOf('r'));
        //-1
        System.out.println("x.toLowerCase(): "+x.toLowerCase());
        System.out.println("x.toUpperCase(): "+x.toUpperCase());
        System.out.println("x.contains(\"kal\"):"+x.contains("kal"));

        String y = " am the best";

        System.out.println("x.concat(y): "+x.concat(y));
    }
}
