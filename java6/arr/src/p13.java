//q =  make arry but with input of size and element

import java.util.Scanner;

public class p13 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        System.out.println("enter size: ");
        int n = kp.nextInt();

        int[] x = new int[n];

        System.out.println("enter arr element: ");
        for(int i = 0; i<x.length; i++){
            x[i] = kp.nextInt();
        }
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
//        enter size:
//        5
//        enter arr element:
//        2 3  5 6 7
//        2 3 5 6 7
//        Process finished with exit code 0



    }
}
