package Strings;

import java.util.HashMap;

// create map //object
public class p22 {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 4, 5, 5};
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
    }
}
