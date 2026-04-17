import java.util.Scanner;
// factorial
public class p2 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int op = kp.nextInt();
        int fact = 1;
        for(int i = 0; i<op; i++){
            fact = fact *(op-i);
        }
        System.out.println(fact);
    }
}
