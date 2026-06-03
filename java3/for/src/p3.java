//3 print half pyramid
//
// *
// **
// ***
// ****


import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int hight = kp.nextInt();
        String str = "";
        for (int i = 0; i<hight; i++){
            str = str + "*";
            System.out.println(str);
        }
    }
}
//5
//        *
//        **
//        ***
//        ****
//        *****