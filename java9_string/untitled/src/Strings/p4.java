package Strings;
//Q: Count the number of vowels in a given string
public class p4 {
    public static void main(String[] args) {
       String x = "kalpesh";
       int count = 0;
      for(int i = 0; i<x.length(); i++){
          int s = x.charAt(i); // char stor as int in asci
          if(s == 97 ||s == 101 || s == 105 ||s ==  117 || s ==111){
              count++;
          }
      }
        System.out.println(count);
      //2
    }
}
