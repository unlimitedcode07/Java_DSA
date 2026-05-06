import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
      int[] arr = {2,3,4,5,6,7};
      for(int i = 0; i<arr.length; i++){
          System.out.print(arr[i]);
      }
      //234567

     //<<<<<<<<<<<<<<<<<0>>>>>>>>>>>>>>>>>
     // input a arr
        Scanner kp = new Scanner(System.in);
        int[] x = new int[7];
         for (int i = 0; i<x.length; i++){
             x[i] = kp.nextInt();
         }
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i]);
            //2223543
        }


      // is se 7 size ka arr bana or har element ki size 0 hai

    }
}
