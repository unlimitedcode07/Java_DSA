package Strings;
// print all substring

//eg : substring og     sea => s, se , sea, e, ea ,a

import java.util.ArrayList;

public class p12 {
    public static void main(String[] args) {
        String sc = "gopi";
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

      String[] op =  sc.split("");
        for(String i: op){
            arr.add(i);
        }
        System.out.println(arr);
        //[g, o, p, i]

        for(int i = 0; i<arr.size(); i++){
            String str = "";
            for(int j = i; j<arr.size(); j++){
               str = str + arr.get(j);
               arr2.add(str);
            }
        }

        System.out.println(arr2);
        //[g, go, gop, gopi, o, op, opi, p, pi, i]
    }
}
