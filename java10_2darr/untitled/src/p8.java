//// rotate by 90 degree clockwise
//Rotate Image
//Medium
//        Topics
//premium lock icon
//        Companies
//You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
//
//You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
//
//
//
//Example 1:
//  1 2 3        |         7 4 1
//  4 5 6        |  to --- 8 5 2
//  7 8 9        |         9 6 3
//
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[7,4,1],[8,5,2],[9,6,3]]
//Example 2:
//
//
//Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
//Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
//
//
//Constraints:
//
//n == matrix.length == matrix[i].length
//1 <= n <= 20
//        -1000 <= matrix[i][j] <= 1000


public class p8 {
    public static void main(String[] args) {


        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("original arr");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("transpose");

        for(int i = 0; i<arr[0].length; i++){
            for(int j = i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("reverse");
        for (int i = 0; i < arr.length; i++) {

            int a = 0;
            int b = arr[0].length-1;
            while(a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
