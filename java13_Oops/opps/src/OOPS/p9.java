package OOPS;
// private se print
//agar ham s1.rno kare to access nahi hoga par ham method lagake print kar sak te hai
// => print
class Student2{
    String name;
    private int rno;  //=> this is
    double cgpa;
    void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
}
public class p9 {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        //s1.rno = 12;  this thro err cause its private
        s1.cgpa = 7.8;
        s1.name = "kp";
        s1.print(); //kp 0 7.8
//                       /\
    }          //      default
}
