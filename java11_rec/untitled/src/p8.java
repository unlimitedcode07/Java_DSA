import java.util.Scanner;

//// a rsised to pow b

public class p8 {
    public static int pow(int a, int b){
        if(b==0)return 1;
        return a*pow(a,b-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a,b));
        //125

        //alter
        System.out.println(Math.pow(5,3));//125.0
    }
}
