
// bubble sort ==> ak algo jisase arr sort hota he

public class p3 {
    public static void print(int[] arr){
        for(int y : arr){
            System.out.print(y+" ");
        }
        System.out.println();
    }
    public static void bubble(int[] arr,int m){
       for(int i = 1; i<arr.length-m; i++){
           if(arr[i-1] > arr[i]){
               int temp = arr[i-1];
               arr[i-1] = arr[i];
               arr[i] = temp;
           }
       }
    }

    public static void main(String[] args) {
       int[] arr = {5,-2,6,7,3,7,9,3,1};
       int n = arr.length;
       print(arr);
        for(int i = 0; i<n-1; i++){
           bubble(arr,i);
           // hame 9 bar loop lagana pada
           // kyu ki har bar arr ki max , second max 3rd max ase last pe set hoti he
          //  is liye ham har bar ak loop ka element kam chalayenge
        }
        print(arr);
        // 5 -2 6 7 3 7 9 3 1
       //  -2 1 3 3 5 6 7 7 9





    }
}
