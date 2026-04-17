//representation of 2d array/ matrix
//                      r  c
//int[][] arr = new int[3][2];
//     _____
//  0  |_|_|
//  1  |_|_|
//  2  |_|_|
//      0  1


// i/o arr
public class p1 {
    public static void main(String[] args) {
      int[][] arr = new int[3][4];
      for(int[] i : arr){
          for(int j: i){
              System.out.print(j);
          }
          System.out.println();
      }
//        0000
//        0000
//        0000
        int[][] arr2 = {{1,2,3,6},{5,6,7,4},{7,8,6,9}};
        for(int[] i : arr2){
            for(int j: i){
                System.out.print(j);
            }
            System.out.println();
        }
//        1236
//        5674
//        7869
    }
}
