// by method change arr element
public class p17 {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6};
        System.out.println(arr[0]);
        op(arr);
        System.out.println(arr[0]);
    }

    public static void op(int[] ok) {
        ok[0] = 7;
    }
//            1
//            7
}
