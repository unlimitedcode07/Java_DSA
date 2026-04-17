package OOPS;
// getter or setter
class Student3{
    String name;
    private int rno;  //=> this is
    double cgpa;
    void print(){  // this is called getter
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getrno(){  // getter
        return rno;
    }
    void setrno(int x){  //setter
       rno = x;
    }
}
public class p10 {
    public static void main(String[] args) {
        Student3 s1 = new Student3();
        //s1.rno = 12;  this thro err cause its private
        s1.cgpa = 7.8;
        s1.name = "kp";
        s1.setrno(34);
        System.out.println(s1.getrno());
        //34

        /// getter setter used to work with private atributes

       // this entire concept knows as encapsulation
        // lekin us me sare s1.--- private hote hai not one of and ye data hiding is come under encapulatiin    
    }
}

