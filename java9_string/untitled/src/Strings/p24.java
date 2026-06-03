package Strings;
// first 24 then 25
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// how to manage key and value  //object
public class p24 {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 5, 5,2};
        HashMap <Integer ,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i]) +1);
            }
        }
        System.out.println(map);
        //{1=1, 2=2, 3=1, 4=1, 5=2}
        System.out.println(map.keySet());
        System.out.println(map.values());
//        [1, 2, 3, 4, 5]
//        [1, 3, 1, 1, 2]

        ArrayList<Integer> keysList1 = new ArrayList<>(map.keySet());
        ArrayList<Integer> valuesList1 = new ArrayList<>(map.values());
        System.out.println("arraylist");
        System.out.println(keysList1);
        System.out.println(valuesList1);
//        [1, 2, 3, 4, 5]
//        [1, 3, 1, 1, 2]
        Integer[] keysArray2 = map.keySet().toArray(new Integer[0]);
        Integer[] valuesArray2 = map.values().toArray(new Integer[0]);
        System.out.println("arr");
        System.out.println(Arrays.toString(keysArray2));
        System.out.println(Arrays.toString(valuesArray2));
//        [1, 2, 3, 4, 5]
//        [1, 3, 1, 1, 2]
        /// this is show  //////////////////////////////////
        int max = 0;
        int ans = arr[0];
       for(int key : map.keySet()){
           if(map.get(key) > max){
               max = map.get(key);
               ans = key;
           }
       }
        System.out.println("max apper number is :"+ans);
       // max apper number is :2
    }
}
