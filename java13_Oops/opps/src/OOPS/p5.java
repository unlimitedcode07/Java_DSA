package OOPS;

public class p5 {
    public static class Car{
        int seats;   // this all are atribute
        String name; // all name length type
        double length;
        String type;
        //ye class hai to  ham method bhi likh sakte hai
        void print(){
            System.out.println(seats+" "+ name +" "+length+" "+type);
        }
    }
    public static void main(String[] args) {
       Car c = new Car();
       c.length = 3.55;
       c.seats =4;
       c.name = "suv";
       c.type = "benzer";

       change(c);
        System.out.println(c.length);
        //6.7    // this is pass by reference
        c.print();
        //4 suv 6.7 benzer
    }

    private static void change(Car v){
        v.length = 6.7;
    }
}
