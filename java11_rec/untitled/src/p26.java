
import java.util.*;
public class p26 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0 and 1 are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // even numbers > 2 are not prime

        for (int i = 3; i*i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(7));








//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int count = 1;
//        int[] arr = new int[a];
//        for(int i = 0; i<a;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i = 1; i<a;i++){
//            if(arr[i-1]<arr[i]){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}





