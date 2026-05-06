package Strings;

import java.util.HashMap;

// show key and val as arr //object
public class p23 {
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
    }
}

