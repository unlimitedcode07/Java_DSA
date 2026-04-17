
//Given a non-negative integer(without leading zeroes) represented as an array arr. Your task is to add 1 to the number (increment the number by 1). The digits are stored such that the most significant digit is at the starting index of the array.
//
//Examples:
//
//Input: arr[] = [5, 6, 7, 8]
//Output: [5, 6, 7, 9]
//Explanation: 5678 + 1 = 5679
//Input: arr[] = [9, 9, 9]
//Output: [1, 0, 0, 0]
//Explanation: 999 + 1 = 1000



public class p29 {
    public static int[] plusOne(int[] digits) {
       for(int i = digits.length-1; i>=0; i--){
           if(digits[i] <9){
               digits[i]++;
               return digits;
           }
           digits[i] = 0;
       }
        // If all digits were 9
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
    public static void print(int[] arr) {
        for(int y : arr){
            System.out.print(y+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,9,9};
        arr = plusOne(arr);
        print(arr);
    }
}
