public class p19 {
    public static int op(int cr,int cc,int lr,int lc){
        if(cr >lr || cc > lc) return 0;
        if(cr == lr || cc == lc) return 1;
        int right = op(cr,cc+1,lr,lc);
        int down = op(cr+1,cc,lr,lc);
        return right +down;
    }

    public static int fact(int m, int n){
        return op(0,0,m-1,n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(3,5)); //15
    }
}
