import javax.sound.midi.Soundbank;

public class p23 {
    public static void main(String[] args) {
        pip(1);  ///1 1 1
        System.out.println();
        pip(2);  //2 1 1 1 2 1 1 1 2 => 2 ke bad pip(1) repet
        System.out.println();
        pip(3);  //3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3 => 3 ke bad  pip(2) repet

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
