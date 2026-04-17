// print element in snack ,
//eg

// 2 3 4      2 3 4 -->
// 4 5 6   to 6 5 4 <--
// 3 4 5      3 4 5 -->
// for square and non square

public class p7 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,61,7,4},{7,8,6,5}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < arr.length; i+=2) {
            System.out.println("is");
            int a = 0;
            int b = arr[0].length-1;
           while(a<b){
               int temp = arr[i][a];
               arr[i][a] = arr[i][b];
               arr[i][b] = temp;
               a++;
               b--;
           }
            System.out.println("done");
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
