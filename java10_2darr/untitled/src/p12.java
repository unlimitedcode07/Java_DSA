//Spiral Matrix
//        Solved
//        Medium
//        Topics
//        premium lock icon
//        Companies
//        Hint
//        Given an m x n matrix, return all elements of the matrix in spiral order.
//
//
//
//        Example 1:
//
//
//        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//        Output: [1,2,3,6,9,8,7,4,5]
//        Example 2:
//
//
//        Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//        Output: [1,2,3,4,8,12,11,10,9,5,6,7]


import java.util.ArrayList;
import java.util.List;

public class p12 {

    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<>();

        int rf = 0;                    // top
        int rl = arr.length - 1;       // bottom
        int cf = 0;                    // left
        int cl = arr[0].length - 1;    // right

        while (rf <= rl && cf <= cl) {

            // top row
            for (int i = cf; i <= cl; i++) {
                res.add(arr[rf][i]);
            }
            rf++;

            // right column
            for (int i = rf; i <= rl; i++) {
                res.add(arr[i][cl]);
            }
            cl--;

            // bottom row
            if (rf <= rl) {
                for (int i = cl; i >= cf; i--) {
                    res.add(arr[rl][i]);
                }
                rl--;
            }

            // left column
            if (cf <= cl) {
                for (int i = rl; i >= rf; i--) {
                    res.add(arr[i][cf]);
                }
                cf++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{6,7,8,9},{10,11,12,13}};
        System.out.println(spiralOrder(arr));
    }
}
