package Strings;

public class p16 {
    public static void main(String[] args) {
        //lets do something
        StringBuilder kp = new StringBuilder(6);
        System.out.println(kp.length()+"\n"+kp.capacity());
                            // 0             //6
        kp.append("kalpesh");
        System.out.println(kp.length()+"\n"+kp.capacity());
                             //7              //14
        kp.setCharAt(1,'p');
        System.out.println(kp.length()+"\n"+kp.capacity()+"\n"+kp);
                              //7             //14            //kplpesh

        // string builder vs string
       // String k = kp;  //Required type:String  Provided: StringBuilder
        String k = kp.toString();  // this is valide

}}
