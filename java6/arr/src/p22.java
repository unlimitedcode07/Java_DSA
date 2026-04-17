public class p22 {
    public static void print(int[] y) {
        for (int j : y) {
            System.out.print(j);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,44,5,6};
        int j = arr.length-1;
        for(int i= 0; i<arr.length; i++){
            int start = arr[i];
            int last = arr[j];
            arr[i] = last;
            arr[j] = start;
            j--;
            if(i>=j){
                break;
            }
        }
        print(arr);

    }
}
