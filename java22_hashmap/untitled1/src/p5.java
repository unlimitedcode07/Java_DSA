import java.util.HashMap;

public class p5 {
    //41
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int []arr = {2,2,1,3,5,3,3,5};
        for(int el: arr){
            if(map.get(el) == null){
                map.put(el, 1);
            }else{
                map.put(el, map.get(el)+1);
            }
        }
        System.out.println(map);
        //{1=2, 2=1, 3=3, 5=2}
        System.out.println(map.keySet());//[1, 2, 3, 5]
        System.out.println(map.values());//[1, 2, 3, 2]
    }
}
