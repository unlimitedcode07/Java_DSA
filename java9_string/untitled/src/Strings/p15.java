package Strings;
// string builder;

public class p15 {
    public static void main(String[] args) {
      StringBuilder s = new StringBuilder("kalpesh");  // default capacity 16
        System.out.println(s +""+ " s.capacity(): "+s.capacity()); // kalpesh
        s.append("am back");
        System.out.println("s.append(\"am back\"): "+s + " \ns.capacity(): "+s.capacity());

    }
}
