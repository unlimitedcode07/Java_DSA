package Strings;
// string compar
public class p14 {
    public static void main(String[] args) {
        String sc = "kalpesh";
        String sc2 = "kalpesh";
        String sc3 = new String("kalpesh");
        System.out.println(sc == sc2); //true
        System.out.println(sc == sc3); //false
        System.out.println(sc.equals(sc3));//true
        //always use this
    }
}
