package OOPS;

public class p20 {
    public static int rec(int i){
        if(i >10){
            return i;
        }

        return rec(i+1);
    }

    public static void main(String[] args) {
        System.out.println(rec(1));


    }
}
