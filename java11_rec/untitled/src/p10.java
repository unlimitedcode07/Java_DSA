import java.util.Scanner;

/// reverse string
///

public class p10 {
    public static int rev(int a , int r){
        if(a == 0) return r;
        return rev(a/10,r*10+a%10);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(rev(a,0));
//        1234
//        4321
    }
}
