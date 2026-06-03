package OOPS;
// private
class Student{
    String name;
    private int rno;  //=> this is
    double cgpa;

}
public class p7 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.rno = 12;  this thro err cause its private
        s1.cgpa = 7.8;
        s1.name = "kp";
    }
}
