import java.util.*;
public class p9 {
//   Array Subset
  static  class Solution {
        public boolean isSubset(int a[], int b[]) {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int el : a){
                if(map.get(el) == null){
                    map.put(el,1);
                }else{
                    map.put(el,map.get(el)+1);
                }
            }

            for(int el : b){
                if(map.get(el) == null){
                    return false;
                }else{
                    map.put(el,map.get(el)-1);
                    if(map.get(el) == 0){
                        map.remove(el);
                    }
                }
            }
            return true;

        }
    }
    public static void main(String[] args) {


    }
}
