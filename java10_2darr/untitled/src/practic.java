
import java.util.*;

public class practic {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            arr.add(new ArrayList<>());
            for(int j = 0; j<=i; j++){
                if(j == 0|| j== i){
                   arr.get(i).add(j,1);
                }else{
                    int val = arr.get(i-1).get(j-1) + arr.get(i-1).get(j);
                    arr.get(i).add(j,val);
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {

        System.out.println(generate(5));
    }
}
