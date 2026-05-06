
//sum of n natural num

public class p11 {
    public static int sum(int a){
       if(a ==1) return 1;
       return a+sum(a-1);//55
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}
