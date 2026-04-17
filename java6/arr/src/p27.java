
// array list = dynamic arr

import java.util.ArrayList;
import java.util.Collections;

public class p27 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // by default it ki size zero he or capacity 10 hoti hai
        arr.add(25);
        arr.add(7);
        arr.add(5);
        arr.add(7);
       // System.out.println(arr[1]);// ye kam nahi karta
        System.out.println("get val of any index: "+arr.get(0)); //25
      //  arr[1] = 9; ye nahi kar sakta
        arr.set(1,9);
        System.out.println("change index val: "+arr);//[25, 9, 5, 7]

        arr.add(1,100);
        System.out.println("add at any index: "+arr);//[25, 100, 9, 5, 7]

        int n = arr.size()-1;
        arr.remove(n);
        System.out.println("remove last: "+arr);

        Collections.reverse(arr);
        System.out.println("reverse arr: "+arr);

    }
}
