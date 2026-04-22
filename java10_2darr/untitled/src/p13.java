//public class p13 {
//}


//Multiply Matrices
//Difficulty: BasicAccuracy: 46.94%Submissions: 28K+Points: 1
//Given two square Matrices A[][] and B[][]. Your task is to complete the function multiply which stores the multiplied matrices in a new matrix C[][].
//
//
//Example 1:
//
//Input:
//N = 2
//A[][] = {{7, 8}, {2 , 9}}
//B[][] = {{14, 5}, {5, 18}}
//
//Output:
//C[][] = {{138, 179}, {73, 172}}
//
//
//Example 2:
//
//Input:
//N = 2
//A[][] = {{17, 4}, {17 , 16}}
//B[][] = {{9, 2}, {7, 1}}
//
//Output:
//C[][] = {{181, 38}, {265, 50}}
//Constraints:
//        1 <=T<= 100
//        1 <= N <= 20
//
//Company Tags
//Paytm
//

//
//
//class Solution {
//    multiply(a, b, n) {
//        let arr = Array.from({length:n},(_,el)=>[]);
//        for(let row =0 ; row<n; row++){
//            for(let col = 0; col<n; col++){
//                let op = Array.from({length:n},(_,j)=> a[row][j]*b[j][col]).reduce((add,el)=> add+ el ,0 )
//                // console.log(op)
//                arr[row].push(op)
//            }
//        }
//        return arr
//
//    }
//}
//
//const op = new Solution()
//console.log(op.multiply([[7,8],[2,9]],[[14,5],[5,18]],2))
//

import java.util.*;

public class p13 {
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

