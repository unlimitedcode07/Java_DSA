
//Q=> Multiply odd index element by 2 and add 10 to even indexed element
public class p19 {
    public static void main(String[] args) {
        int[] arr = {3,46,74,-7,92,-6,-76,8};
        change(arr);
        print(arr);//6 56 148 3 184 4 -152 18
    }

    public static void change(int[] y) {
        for(int i = 0; i<y.length; i++){
            if(i%2 == 0){
                y[i] = y[i]*2;
            }else{
                y[i] = y[i]+10;
            }
        }
    }
    public static void print(int[] p1) {
        for (int i = 0; i < p1.length; i++) {
            System.out.print(p1[i] + " ");
        }
    }
}
