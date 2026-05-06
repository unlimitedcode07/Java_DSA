import java.util.ArrayList;
import java.util.List;

public class p22 {
    public static void ok(int n,List<String> arr,String ans,int r,int l ){
        if(l == n && r == n) {
            arr.add(ans);
            return ;
        }


        if(r < n){
            ok(n,arr,ans+"(",r+1,l);
        }
        if(l < r){   // cause You can NEVER fix a string that starts with ).
            ok(n,arr,ans+")",r,l+1);
        }

    }
    public static List<String> generateParenthesis(int n) {
        List<String> arr = new ArrayList<>();
        String s = "";
        ok(n,arr,s,0,0);
        return arr;
    }
    public static void main(String[] args) {

        System.out.println(generateParenthesis(2));
    }
}

