//merge 2 sorted arr
public class p30 {
    public static void sort(int[] a,int[] b, int[] c){
        int a1 = 0;
        int b1 = 0;
        int i = 0;
        while (a1 < a.length && b1 < b.length) {
            if (a[a1] <= b[b1]) {
                c[i++] = a[a1++];
            } else {
                c[i++] = b[b1++];
            }
        }
        while (a1 < a.length) {
            c[i++] = a[a1++];
        }

        while (b1 < b.length) {
            c[i++] = b[b1++];
        }


    }
    public static void main(String[] args) {
        int [] a = {2,3,6,8,9};
        int [] b = { 3, 4,6, 8,8};
        int [] c = new int[a.length+ b.length];
        sort(a,b,c);
        for(int y: c){
            System.out.print(y+" ");
            //2 3 3 4 6 6 8 8 8 9
        }

    }
}
