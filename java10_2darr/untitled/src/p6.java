
// print element of 2d array column - wise / transpose,
//eg

// 2 3 4      2 4 3
// 4 5 6   to 3 5 4
// 3 4 5      4 6 5
// for square and non square
public class p6 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,61,7,4},{7,8,6,5}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int a = arr.length;
        int b = arr[0].length;
        if(a == b) {
            for(int i = 0; i<arr.length; i++){
                for(int j = i; j<arr.length; j++){
                    int temp = arr[i][j] ;
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }else{
            int[][] t = new int[b][a];
            for(int i = 0; i<arr[0].length; i++){
                for(int j = 0; j<arr.length; j++){
                    t[i][j] = arr[j][i];
                }
            }
            arr = t;

        }
        System.out.println("after");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
