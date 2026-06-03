import java.util.Scanner;

//befor that read  theory/f2.txt
public class p6q1 {
    public static double fact(double n){
        double fact = 1;
        while (n>1) {
            fact = fact *n;
            n = n-1;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        System.out.println("enter n");
        double n = kp.nextDouble();
        System.out.println("enter r");
        double r = kp.nextDouble();

        double ccr = fact(n)/fact(r)*fact(n-r);
        double npr = ccr*r;

        System.out.print("ccr:"+ccr+"\n"+"npr:"+npr);
    }
}
