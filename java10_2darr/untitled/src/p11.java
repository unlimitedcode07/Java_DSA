import java.util.Arrays;
//Search a 2D Matrix II
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
//
//
//Example 1:
//
//
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
//Output: true
//Example 2:
//
//
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
//Output: false

//tip
//Started from top-right corner ✅
//Compared with target ✅

//Moved:
//left when value is bigger
//down when value is smaller

//Returned boolean ✅

//This is the optimal O(m + n) solution. Good job 👏
public class p11 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while(row < matrix.length-1 && col >=0){
            if(matrix[row][col] == target){

                return true;
            }else if(matrix[row][col] > target){

                col--;
            }else{

                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(searchMatrix(arr,5));


    }
}
