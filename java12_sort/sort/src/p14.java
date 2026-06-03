import java.util.Arrays;

//missing element in arr missing in array

public class p14 {
    public static void main(String[] args) {
       int[] arr = {8,2,4,5,3,7,1};
        int i = 0;
        int j = arr.length;
        while(i<j){
            if(arr[i] != i+1 && arr[i] <= arr.length){
                int temp1 = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp1;
            }else{
                i++;
            }
        }
        for(int k = 0; k<j; k++){
            if(arr[k] != k+1){
                System.out.println(k+1);
            }
        }

    }
}
