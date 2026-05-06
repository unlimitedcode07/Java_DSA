
//this is optimal buble sort
// best case O(n)
// av and worst is O(n'2)
public class p4 {
    public static void print(int[] arr){
        for(int y : arr){
            System.out.print(y+" ");
        }
        System.out.println();
    }
    public static boolean bubble(int[] arr,int m){
        int count = 0;
        for(int i = 1; i<arr.length-m; i++){
            if(arr[i-1] > arr[i]){
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
            // hame 9 bar loop lagana pada
            // kyu ki har bar arr ki max , second max 3rd max ase last pe set hoti he
            //  is liye ham har bar ak loop ka element kam chalayenge
            if(op){// that means op is true
                i = n-1;
            }
        }
        print(arr);
        // 5 -2 6 7 3 7 9 3 1
        //  -2 1 3 3 5 6 7 7 9
//<<<<<<<<<<<<<<<<<<<<<0>>>>>>>>>>>>>>>>>>>
//        1 3 2 4
//        ok:0
//        ok:1
//        iteration0
//        ok:0
//        ok:1
//        arr is sorted
//                iteration1
//        1 2 3 4

    }
}

