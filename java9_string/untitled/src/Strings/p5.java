package Strings;
// palandrom
public class p5 {
    public static void main(String[] args) {
        String op = "amnma";
        int i = 0;
        int j = op.length()-1;
        while(i<=j){
            int x = op.charAt(i);
            int y = op.charAt(j);
            if(x != y){
                System.out.println(false);
               break;
            }
            i++;
            j--;
        }
        System.out.println(true);
    }
}
