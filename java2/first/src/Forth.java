import java.util.Scanner;
public class Forth {
    public static void main(String[] args){
       Scanner kp = new Scanner(System.in) ;
       int btn = kp.nextInt();

       switch(btn){
           case 1: System.out.println("hellow");
           break;
           case 2: System.out.println("namaste");
           break;
           case 3: System.out.println("bonjur");
           break;
           default :
               System.out.println("invalid");
//               2
//               namaste
       }
    }
}
