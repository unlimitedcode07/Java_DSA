package OOPS;
// default val
class Stud{
    String name = "kp"; // nahi rakha to null default
    private int rno;  // is ka 0
    double cgpa; // is ka 0.0
}
public class p8 {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        //s1.rno = 12;  this thro err cause its private
        s1.cgpa = 7.8;
        s1.name = "kp";
    }
}
