package Strings;

import java.util.Arrays;

class practic{
    public static void main(String[] args) {
        int num = 10753;
        int digits = String.valueOf(num).length();

//        int temp = num;
//        int digits = 0;
//
//        while (temp > 0) {
//            digits++;
//            temp /= 10;
//        }
//
        int[] arr = new int[digits];

        for (int i = digits - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }

        System.out.println(Arrays.toString(arr));
    }
}