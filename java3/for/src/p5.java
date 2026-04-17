
//5
//        *
//        **
//        ***
//        ****
//        *****

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int height = kp.nextInt();
        String str = "";
        for(int i = 0 ; i<height ; i++){
            for(int j = 0 ; j<height-i ; j++){
                System.out.print(" ");

            }
            str = str + "*";
            System.out.println(str);
        }
    }
}
