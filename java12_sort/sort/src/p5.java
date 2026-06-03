import java.util.Arrays;

//mearge 2 sorted array
//
public class p5 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,3,6,8,10,21};
        int[] arr = new int[arr1.length+arr2.length];
        int i = 0; int j = 0; int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]) arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        }
        while(i<arr1.length) arr[k++] = arr1[i++];
        while(j<arr2.length) arr[k++] = arr2[j++];
        System.out.println(Arrays.toString(arr));
    }
}
