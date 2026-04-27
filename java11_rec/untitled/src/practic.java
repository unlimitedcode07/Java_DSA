

import java.util.*;

public class practic {
    public static List<String> AllPossibleStrings(String s) {
     List<String > arr = new ArrayList<>();
     int i = 0;
     String curent = "";
     arr = ans(arr,s,i,curent) ;
     Collections.sort(arr);
     arr.remove(0);
    return arr;
    }
    public static void main(String[] args) {
      String op = "abc";
      System.out.println(AllPossibleStrings(op));
    }
    public static List<String> ans(List arr , String s, int i, String c) {
      if(i >=3){
          arr.add(c);
          return arr;
      }

      ans(arr,s,i+1,c);
      return ans(arr,s,i+1,c+s.charAt(i));
    }

}