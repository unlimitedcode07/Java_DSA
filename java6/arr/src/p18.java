import java.util.Arrays;

//sort
public class p18 {
    public static void main(String[] args) {
        int[] arr = { 2,5,-4,9,45,7};
        print(arr); //2 5 -4 9 45 7
        Arrays.sort(arr);
        System.out.println();
        print(arr); //-4 2 5 7 9 45
    }

    public static void print(int[] p1) {
        for(int i = 0; i<p1.length; i++){
            System.out.print(p1[i]+" ");
        }
//        for (int j : p1) {
//            System.out.print(j + " ");
//        }  // same but advance
    }
}
