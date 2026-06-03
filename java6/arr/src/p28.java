// reverse arr list

import java.util.ArrayList;

public class p28 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        //[1, 2, 3, 4, 5]

        int j = arr.size()-1;
        for(int i = 0;i<arr.size();i++){
            int start = arr.get(i);
            int end = arr.get(j);
            arr.set(i,end);
            arr.set(j,start);
            j--;
            if(i>=j){
                break;
            }
        }
        System.out.println(arr);
        //[5, 4, 3, 2, 1]
    }
}
