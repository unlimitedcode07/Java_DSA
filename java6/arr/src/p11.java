

public class p11 {
    public static void main(String[] args) {
        int[] x = {6,2,4,8};
        System.out.println(x[3]);
        //8

        //update  // arr is mutable => can change
        x[3] = 67;
        System.out.println(x[3]);
        //67

        // send bar ham kese initialize kare
        int[] arr = new int[4];

        System.out.println(arr);
        // is me 0 to 3 index hoga
    }
}
