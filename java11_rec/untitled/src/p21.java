import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p21 {

    public static void Possible(String ans,String s,int index,List<String> list) {
        if(index == s.length()){
          if(ans.length()!= 0)  list.add(ans);
          return ;
        }
        char c = s.charAt(index);
        Possible(ans+c,s,index+1,list);
        Possible(ans,s,index+1,list);
    };
    public static List<String> AllPossibleStrings(String s) {
        List<String> list = new ArrayList<>();
        Possible("",s,0,list);
        Collections.sort(list);
        return list;
    };
    public static void main(String[] args) {
        System.out.println(AllPossibleStrings("abc"));
    }
}
