import java.util.Scanner;
public class third {
    public static void main(String[] args){
        Scanner kp = new Scanner(System.in);
        int ip1 = kp.nextInt();
        int ip2 = kp.nextInt();

        if(ip1 == ip2){
            System.out.println("same");
        } else if (ip1>ip2) {
            System.out.println("ip1 first is great");
        }else{
            System.out.println("ip2 is greater");
        }
//        9
//        7
//        ip1 first is great
    }
}
