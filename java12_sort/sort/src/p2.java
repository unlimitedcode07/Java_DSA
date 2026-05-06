//1
//11
//21
//1211
//111221

//look and say patern



import java.util.*;


public class p2 {
    public static void main(String[] args) {
        System.out.println(say(3));
    }

    private static String say(int i) {
        String str = "1";
        ArrayList<String> arr= new ArrayList<>();
        arr.add(str);
        pattern(i-1,arr);
        System.out.println(arr);
        return arr.get(arr.size()-1);
    }

    private static void pattern(int i,  ArrayList<String> arr) {
       if(i ==  0){
           return;
       }
      // System.out.println(arr);
       int a = 0;
       int count = 0;
       String op = "";
       char atposition = arr.get(arr.size()-1).charAt(0);
      //  System.out.println(arr.get(arr.size()-1).length()+"j");
       for(int j = 0; j<arr.get(arr.size()-1).length();j++){

           if(arr.get(arr.size()-1).charAt(a) == arr.get(arr.size()-1).charAt(j) ){
             count++;
               if (arr.get(arr.size()-1).length() == j+1) {
                   op = op+String.valueOf(count)+atposition;
                   arr.add(op);
                   break;
               }
           }
           else{
               a = j;
               op = op+String.valueOf(count)+atposition;
               count = 1;
               atposition = arr.get(arr.size()-1).charAt(j);
              // System.out.println(atposition);
               if (arr.get(arr.size()-1).length() == j+1) {
                   op = op+String.valueOf(count)+atposition;
                   arr.add(op);
                   break;
               }



           }

       }
        pattern(i-1,arr);

    }


}
