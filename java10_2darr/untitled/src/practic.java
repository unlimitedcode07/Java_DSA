
import java.util.*;

public class practic {
     static int sum(int A[][], int B[][], int i, int j){
         int k = 0;
         int kp = 0;
        while(k<=A.length-1){
           kp = kp +  A[i][k] *B[k][j] ;
           k++;
        }
        return kp;
    }
    public static void multiply(int A[][], int B[][], int C[][], int N) {
        // add code here.


        for(int i = 0; i<A.length; i++){
            for(int j = 0; j<A.length; j++){
                C[i][j] = sum(A,B,i,j);
            }
        }

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int[] a : C) {
            list.add(new ArrayList<>());   // create new row

            for (int el : a) {

                list.get(list.size() - 1).add(el);  // add element to last row
            }
        }

        System.out.println(list);


    }

    public static void main(String[] args) {
     int A[][] = {{7, 8}, {2 , 9}};
     int B[][] = {{14, 5}, {5, 18}};
     int n = A.length;
     int C[][] = new int[n][n];

     multiply(A,B,C,n);
//[[138, 0], [0, 0]]
    }
}
