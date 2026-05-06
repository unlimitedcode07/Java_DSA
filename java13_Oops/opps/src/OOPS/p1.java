package OOPS;

public class p1 {
    public static class Student{  // means  class == classification
        ///  this is khudaka data types
      String name;
      int rno;
      double cgpa;
    }
    public static void main(String[] args) {
        Student s1 = new Student(); // declearation
        s1.name = "kp";
        s1.rno = 67;
        s1.cgpa = 7.89;

        Student s2 = new Student(); // declearation
        s2.name = "td";
        s2.rno = 68;
        s2.cgpa = 9.89;

        Student s3 = new Student(); // declearation
        s3.name = "om";
        s3.rno = 70;
        s3.cgpa = 8.89;

       // s1,s2,s3 are object and Student is class
        // object is real life entiti and class is blue print

        System.out.println(s1.name +" "+s1.rno+" "+s1);
        // print
        // kp 67
        // OOPS.p1$Student@5f184fc6
        //Update
        s1.rno = 45;
        System.out.println(s1.rno);
        //45

        //imp => in Scanner sc
        // Scanner is class and sc is object ;
    }
}
