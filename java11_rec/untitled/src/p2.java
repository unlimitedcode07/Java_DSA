public class p2 {
    public static void main(String[] args) {
        print(1,5);
    }
    public static void print(int x, int n){
        if(x> n) return ;
        System.out.println(x);
        print(x+1,n);
//        1
//        2
//        3
//        4
//        5
    }
}
