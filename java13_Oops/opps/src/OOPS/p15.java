package OOPS;
//final
class Crickter{
    final String teaam = "india";
    String name;
    double avg;
}
public class p15 {
    public static void main(String[] args) {
      Crickter c1 = new Crickter();
        System.out.println(c1.teaam);
        //india
        //but not
        // c1.teaam = "newzelang";
        // this line give erer so we cant change the final
    }
}
