package OOPS;
// method over loding same
public class p12 {
    //let make method that return max num
    public static int max(int a, int b, int c){
        return a+b+c;
    }
    public static int max(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(max(2,3));
        System.out.println(max(1,2,3));
        //5
        //6   erre nahi aya par chal gay
    }

  /////////////////////////////////////////////////////////////////

}
