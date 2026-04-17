// optimisesd


import java.util.Scanner;

public class p9 {
        public static int pow(int a, int b) {
            if (b == 0) return 1;

            int half = pow(a, b / 2);

            if (b % 2 == 0) {
                return half * half;
            } else {
                return half * half * a;
            }// if dont understand
//            if(b == 0) return 1;
//            if(b%2 == 0){
//                return pow(a,b/2)* pow(a,b/2);
//            }else{
//                return pow(a,b/2)* pow(a,b/2)*a;
//            }
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
}
