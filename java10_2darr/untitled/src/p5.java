
//find row with max sum
public class p5 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,6},{5,61,7,4},{7,8,6,9}};
        int row = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    sum = sum + arr[i][j];
                }
            }
            if(max < sum){
                max = sum;
                row = i;
            }
        }
        System.out.println(row);// 1
    }
}
