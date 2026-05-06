package Strings;
// most frequent char

import java.util.ArrayList;
import java.util.Collections;

//Given a string s of lowercase alphabets. The task is to find the maximum occurring character in the string s. If more than one character occurs the maximum number of times then print the lexicographically smaller character.
//
//        Examples:
//
//Input: s = "testsample"
//Output: 'e'
//Explanation: 'e' is the character which is having the highest frequency.
//        Input: s = "output"
//Output: 't'
//Explanation: 't' and 'u' are the characters with the same frequency, but 't' is lexicographically smaller.
//        Constraints:
//        1 ≤ |s| ≤ 100
public class p20 {
    public static String freq(String s){
        // input is in string so we convert it in to asci  cause to print le lexicographically
        // need arr ==> string to char to asci
        //sort asci
        ArrayList<Integer> arri = new ArrayList<>();
      char[] arr = s.toCharArray();

      for(int i : arr){
         arri.add(i);
      }
        Collections.sort(arri);

      // go in linear, as arr is sorted so we go linear if same count
        // if different then reset count
        // if count is greater than previous update max count
        // thsi saves from same frequency count as we sort it before

        int temp = 0;
        int count = 0;
        int max_count = 0;
        int fre = arri.get(0);
        for(int i = 0; i<arri.size(); i++){
           if(arri.get(temp) == arri.get(i)){
               count++;
           }
           else{
               temp = i;
               count = 1;
           }
           if(max_count < count){
               max_count = count;
               fre = arri.get(temp);

           }
        }

        // we have to return it in to string
        // char to string builder to string
     char ans = (char)fre;
     StringBuilder ans2 = new StringBuilder();
     ans2.append(ans);
     String as = ans2.toString();
     return as;

    }
    public static void main(String[] args) {
        String s = "output";
        System.out.println(freq(s));

    }
}
