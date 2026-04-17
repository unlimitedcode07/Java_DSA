package Strings;

import java.util.Arrays;

// Q => anagram  is anagram
//eg // telent and letent
     // care and race
     //
public class p19 {
    public static boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;
       char[] a = s.toCharArray();
       char[] b = t.toCharArray();
       Arrays.sort(a);
       Arrays.sort(b);
      for(int i = 0; i<a.length; i++){
          System.out.println("a[i]:"+a[i]+" b[i]"+b[i]);
          if(a[i] != b[i]){
              return false;
          }
      }

       return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("rat","car"));
//        a[i]:a b[i]a
//        a[i]:r b[i]c
//        false
     }
}
