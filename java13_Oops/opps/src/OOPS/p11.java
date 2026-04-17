package OOPS;
//constructure

//problem
// har baerr Student s = new Student()
// or s.something
//    s.something   so its boring to do continue


public class p11 {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
//        Car(){  // this is default constructure
//              koi return type bhi nahi hota
//        }  ye hota hai par dikhata nahi hai
        //lets modify it
        Car(){

        }
        Car(int x , String n , double d){
           seats = x;
           name = n;
           length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }

    }
    public static void main(String[] args) {
      Car c = new Car(3, "bmw",4.7);
       c.print();  // 3 bmw 4.7
        Car r = new Car(4, "alto",6.7);
        r.print(); //4 alto 6.7
        Car c3 = new Car();
        c3.name = "kppp"; // this dont give errer
        // explaination
        //=> we create car(arg,arg,arg) so when we create new car it expect 3 argument like c,r
        // but if want to use old one like c3  {default constructur }we has to create another Car in car class this is called
        // this is called constructure over lodding
    }
}
