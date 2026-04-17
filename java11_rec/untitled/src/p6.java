// print n from increases and decreases
import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print(n-1);
        System.out.print(n+" ");
        //5 4 3 2 1 2 3 4 5
    }
}

