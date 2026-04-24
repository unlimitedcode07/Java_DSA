
import java.util.*;

public class practic {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println(print(n,0));

    }

    static long print(int n, int t){
       if(n == 0){
           return t;
       }
       t = t + n;
       return print(n-1, t);
    }


}