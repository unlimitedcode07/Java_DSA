public class p15 {
    public static void main(String[] args) {
        int[] arr = { 2,6,3,8,3,1};

        int max = arr[0]; // or Integer.MIN_VALUE;   bhi kar sakte hai which is -2147483648
        //int max ; asa karunga to for loop me max initialization nahi hoga is liye value de di
        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        System.out.println("max: "+max);
        //max: 8
    }
}
