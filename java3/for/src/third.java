import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int num = kp.nextInt();
        int op = 0;
        for(int i = 0; i<=num; i++){
           op = op + i ;
        }
        System.out.println("sum is :"+op);
    }
}
//10
//sum is :55
