
// after p1
// max of 3 input
import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        System.out.println("enter no");
        double a = kp.nextDouble();
        double b = kp.nextDouble();
        double c = kp.nextDouble();

     //   System.out.println(Math.max(a,b,c)); this is wrong
        System.out.println(Math.max(Math.max(a,b),c));
//        enter no
//        2
//        3
//        1
//        3.0
    }
}
