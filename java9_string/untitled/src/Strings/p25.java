package Strings;
import java.util.*;

public class p25 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,3,3,4};
       HashMap<Integer , Integer> map = new HashMap<>();
       for(int el : arr){
           if(map.get(el) == null){
               map.put(el,1);
           }else{
               map.put(el,map.get(el)+1);
           }
       }
        System.out.println(map);
       //{1=2, 2=2, 3=4, 4=1}
        //  this is of type collection map.values(), and map.keySet();

        Object[] obj = map.keySet().toArray();
        System.out.println(obj);//[Ljava.lang.Object;@6acbcfc0
        System.out.println(Arrays.toString(obj));//[1, 2, 3, 4]

        Integer[] obj1 = map.keySet().toArray(new Integer[0]); //or (Integer[]) map.keySet().toArray();
        System.out.println(Arrays.toString(obj1));//[1, 2, 3, 4]
        for(int el : obj1){
            System.out.print(el+ " "); //1 2 3 4
        }
        //what is this Arrays.toString(obj1)
        // we use to see array in print
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr3));
        //[1, 2, 3, 4, 5]

        /// know with arraylist


    }
}
