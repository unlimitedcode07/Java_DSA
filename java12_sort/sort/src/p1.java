//look and say
public class p1 {
    public static void main(String[] args) {

        int l = 7;
        int b = 6;
        for(int i = 0; i<b; i++){
            System.out.println();
            for(int j = 0; j<l; j++){
                if(i == 0 || i == b-1){
                    System.out.print("*");
                }else if(j== 0 || j == l-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }



    }
}
