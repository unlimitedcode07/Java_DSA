
//hollow rectangle
// *****
// *   *
// *   *
// *****


import java.util.Scanner;
import java.util.SortedMap;

public class p2 {
    public static void main(String[] args) {
        Scanner kp = new Scanner(System.in);
        int hor = kp.nextInt();
        int ver = kp.nextInt();

        for(int i = 0; i<ver; i++){
            for(int j = 0; j<hor; j++){
               if(i ==0 || i == ver-1 || j== 0 || j== hor-1){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
               // System.out.print(i+""+j);
            }
            System.out.println();
        }
    }
}
