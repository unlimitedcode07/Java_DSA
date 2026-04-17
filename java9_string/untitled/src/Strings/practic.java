package Strings;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class practic {
    public static String getMaxOccuringChar(String s) {
        char[] ch = s.toCharArray();
        HashMap<Character , Integer> map = new HashMap<>();
        for(char el : ch){
            if(map.get(el) == null){
               map.put(el,1);
            }else{
                map.put(el,map.get(el)+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        ArrayList<Character> mlist = new ArrayList<>();

        int max = Collections.max(list);
        for(char el : map.keySet()){
           if(map.get(el) == max) {
               mlist.add(el);
           }
        }
        Collections.sort(mlist);
        String ans = String.valueOf(mlist.get(0));

      return ans;
    }
    public static void main(String[] args){
      String str =  "testsample";
        System.out.println(getMaxOccuringChar(str));

    }
}
