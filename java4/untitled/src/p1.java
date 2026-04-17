// reverse int


import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int num = kp.nextInt();
        int count = 0;
        int op =0;
        int new_num =0;
        while(num!=0){
            op = num%10;
            new_num = (new_num*10)+op;
            num = num/10;
        }
        System.out.println(new_num);
    }
}
