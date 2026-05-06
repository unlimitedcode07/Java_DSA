import java.util.Scanner;

public class p4 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int hight = kp.nextInt();

        for(int i=0; i<hight; i++ ){
            for(int j=0; j<hight-i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//5
//        *****
//        ****
//        ***
//        **
//        *