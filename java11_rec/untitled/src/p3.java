public class p3 {
    static int x = 10;
    public static void main(String[] args) {
        fun();
        System.out.println(x); // 20
        // globaly declar kare to ye hota hai
    }
    public static void fun(){
        x = 20;
    }
}
