package Strings;

import java.util.ArrayList;

//sum of substing;
public class p13 {
    public static void main(String[] args) {
        String sc = "12";
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        String[] op =  sc.split("");

        for(String i: op){
            arr.add(i);
        }
        System.out.println(arr);
       int add = 0;
        for(int i = 0; i<arr.size(); i++){
            String str = "";
            for(int j = i; j<arr.size(); j++){
                str = str + arr.get(j);
                int ad = Integer.parseInt(str);
                add = add + ad;
            }
        }
        System.out.println(add);
        //[6, 7, 5, 9]
        //8421
    }
}
