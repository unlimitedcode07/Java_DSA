//
//Pascal's Triangle
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Given an integer numRows, return the first numRows of Pascal's triangle.
//
//In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
//
//
//Example 1:
//
//Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
//Example 2:
//
//Input: numRow

import java.util.ArrayList;
import java.util.List;//

public class p10 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
            for(int i = 0; i<numRows; i++){
               arr.add(new ArrayList<>());
               for(int j=0; j<=i; j++ ){
                   if(j==0 || j==i){
                       arr.get(i).add(j,1);
                   }
                   else{

                       int val = arr.get(i-1).get(j-1)+arr.get(i-1).get(j);
                       arr.get(i).add(j,val);
                   }
               }
            }

        return arr;//[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]

    }
    public static void main(String[] args) {
        System.out.println(generate(5));

    }
}
