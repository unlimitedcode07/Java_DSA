import java.util.Scanner;

public class p16 {
    public static int fact(int ft){
        if(ft < 1) return 1;
        return ft*fact(ft-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int sum = 0;
       int i = 0;
       int j = sc.nextInt();

        while(i<=j){
            int one = fact(i);
            int sec = fact(j);
            int op = sec/(one*fact(j-i));
            sum = sum+ op;
            i++;
            j--;
        }
        System.out.println(sum);
    }
}
