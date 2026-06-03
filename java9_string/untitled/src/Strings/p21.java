package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p21 {
    public static void main(String[] args) {
        String s = "my name is kalpesh";
        String[] arr= s.split(" ");
        StringBuilder sp = new StringBuilder();
        for(String w : arr){
            sp.append(new StringBuilder(w).reverse()).append(" ");
        }
        System.out.println(sp.toString().trim());
         //ym eman si hseplak
    }
}
