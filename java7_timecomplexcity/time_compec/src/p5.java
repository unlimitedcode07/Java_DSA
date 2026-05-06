// reverse buble sort  see line 12 only change line
public class p5 {
    public static void print(int[] arr){
        for(int y : arr){
            System.out.print(y+" ");
        }
        System.out.println();
    }
    public static boolean bubble(int[] arr,int m){
        int count = 0;
        for(int i = 1; i<arr.length-m; i++){
            if(arr[i-1] < arr[i]){  // only change this
                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
            }else{
                System.out.println("ok:"+count);
                count++;
                if(arr.length-m-1 == count){
                    System.out.println("arr is sorted");
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
//{5,-2,6,7,3,7,9,3,1};
        int n = arr.length;
        print(arr);
        for(int i = 0; i<n-1; i++){
            boolean op = bubble(arr,i);
            System.out.println("iteration"+i);

            if(op){
                i = n-1;
            }
        }
        print(arr);



    }
}

