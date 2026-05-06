
//sum of arr

import java.util.Arrays;

public class p3 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,6},{5,6,7,4},{7,8,6,9}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);// 64
    }
}
