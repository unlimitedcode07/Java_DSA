import java.util.Arrays;
// imp rull => take away
// if we decelar int val like count dont pass it in function its global so it can do there job if pass it becom local and wont work
public class p11 {
    public static void main(String[] args) {
        int[] arr = {24 ,18, 38 ,43 ,14 ,40, 1 ,54};
        System.out.println(inversionCount(arr));
    }
    static int count;
    public static int inversionCount(int[] arr){
        count = 0;
        inversion(arr);
        return count;
    }

    public static int inversion(int[] arr){
        int n = arr.length;
        if(n == 1){
            return 0;
        }
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        int idx = 0;

        for(int i = 0; i<a.length; i++){
            a[i] = arr[idx++];
        }
        for(int i = 0; i<b.length; i++){
            b[i] = arr[idx++];
        }

        inversion(a); inversion(b);

       // System.out.println(Arrays.toString(a)+" "+Arrays.toString(b)+" "+Arrays.toString(arr)+""+count);
        merg(a,b,arr);

        return count + fucket(a, b);
    }

    private static int fucket(int[] a, int[] b) {
        //System.out.println(count+" pre");
        int i = 0; int j = 0;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count = count + (a.length-i);
                j++;
            }else{
                i++;
            }
        }
       // System.out.println(count+" post");
        return count;
    }

    private static void merg(int[] a, int[] b, int[] arr) {
        int i = 0; int j = 0; int k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];
        while (j<b.length) arr[k++] = b[j++];
    }


}
