import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int h1 = kp.nextInt();
        int op = 0;
        for(int i = 1; i<=h1 ;i++){
            for(int j = 1; j<=i; j++){
                op = op +1;
                System.out.print(op);
            }
            System.out.println();
        }
    }
}
//5
//        1
//        12
//        123
//        1234
//        12345