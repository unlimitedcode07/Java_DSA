// max in 2d arr

public class p4 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,6},{5,61,7,4},{7,8,6,9}};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);// 61
    }
}
