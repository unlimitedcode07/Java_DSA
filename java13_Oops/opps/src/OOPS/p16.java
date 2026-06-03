//static
package OOPS;
class Crickter1{
    static String teaam = "japan";
    String name;
    double avg;
}
public class p16 {
    public static void main(String[] args) {
        Crickter1 c1 = new Crickter1();
        Crickter1 c2 = new Crickter1();
        c1.teaam = "india";
        System.out.println(c2.teaam);
         //india
        // static me jo bi change karega sabko vo vali current val lagjayegi
    }
    // is ka faida ye hai hi common box milega har ka sepret nahi so space  bachagi so best use
    // final static String teaam = "japan"  for never changing val
}

