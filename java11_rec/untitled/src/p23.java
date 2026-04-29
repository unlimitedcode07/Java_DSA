import javax.sound.midi.Soundbank;

public class p23 {

    public static void main(String[] args) {
        pip(2);
//        System.out.println();
//        pip(2);
//        System.out.println();
//        pip(3);
    }

    public static void pip(int n){
        if(n == 0) return ;
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
    }
}
