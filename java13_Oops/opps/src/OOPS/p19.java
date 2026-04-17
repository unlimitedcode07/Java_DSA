package OOPS;
import java.util.*;
import java.util.Arrays;
// inheritanse
class pokemon{
    int power;
    String type;

    pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }
    pokemon(){

    }
    void print(){
        System.out.println(this.power+" "+this.type);
    }
}

class modo extends pokemon{
    String books;
    modo(String type , int power, String book){
       this.power = power;
       this.type = type ;
       this.books = book;
    }
    void print(){
        System.out.println(this.power+" "+this.type+" "+this.books);
    }
    // rest of charecter will of pokemon
}

public class p19 {
    public static void main(String[] args) {
        pokemon p = new pokemon("electric",45);
        p.print();//45 electric
        modo ZatchBell = new modo("electric",60,"red");
        ZatchBell.print();
        //60 electric red


    }
}
