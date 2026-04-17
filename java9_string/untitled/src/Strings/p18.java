package Strings;

public class p18 {
    public static void main(String[] args) {
      String k = "kalpesh";
      StringBuilder kp = new StringBuilder(k);
      kp.delete(0,1);   // this is costly process cause when you delete the whole string has to move to adjest
      System.out.println(kp); //alpesh

      kp.insert(1,3);// thia is also costly
      System.out.println(kp); //a3lpesh

    }
}
