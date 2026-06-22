import java.util.*;

class Student implements Comparable<Student>{
    String name ;
    int roll_num;
    int cgpa;
    Student(String name,int roll_num, int cgpa){ //constructure
        this.name = name;
        this.roll_num = roll_num;
        this.cgpa = cgpa;
    }
    @Override
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', roll=" + roll_num + ", cgpa=" + cgpa + "}";
    }

}

public class p5 {
    public static void main(String[] args) {
        Student a = new Student("kalpesh", 5, 9);
        Student b = new Student("tejas", 4, 10);
        Student c = new Student("om", 1, 11);
        Student d = new Student("nishant", 2, 13);
        Student e = new Student("ayush", 3,12 );

        List<Student> list = Arrays.asList(a,b,c,d,e);
        //System.out.print(list);
        //[Student@3feba861, Student@5b480cf9, Student@6f496d9f, Student@723279cf, Student@10f87f48][Student@3feba861, Student@5b480cf9, Student@6f496d9f, Student@723279cf, Student@10f87f48]
        //before

        //after this addd
//        @Override
//        public String toString() {
//            return "Student{name='" + name + "', roll=" + roll_num + ", cgpa=" + cgpa + "}";
//        }

      ///  System.out.print(list);
      //  [Student{name='kalpesh', roll=5, cgpa=9}, Student{name='tejas', roll=4, cgpa=10}, Student{name='om', roll=3, cgpa=11}, Student{name='nishant', roll=2, cgpa=13}, Student{name='ayush', roll=1, cgpa=12}]

//        because Java doesn't know how to print a Student object.
//
//        You need to override toString():
//        for(Student s : list){   // thissi alter
//            System.out.println(s.name);
//        }


        // go to p6 for interface releted info

        //then hear
        Collections.sort(list);
        for(Student s : list){   // thissi alter
           System.out.println(s.name);
       }
//                ayush
//                kalpesh
//                nishant
//                om
//                tejas
        System.out.println("---------------------");
        list.sort(Comparator.comparingInt(s -> s.roll_num));

        for(Student s : list){   // thissi alter
            System.out.println(s.name+"  "+s.roll_num);
        }
//        om  1
//        nishant  2
//        ayush  3
//        tejas  4
//        kalpesh  5

        System.out.println("---------------------");
        list.sort((s1, s2) -> Integer.compare( s1.roll_num,s2.roll_num));//assending =>small to  larg
        list.sort((s1, s2) -> Integer.compare(s2.roll_num, s1.roll_num)); // descending  =>larg to small
        for(Student s : list){   // thissi alter
            System.out.println(s.name+"  "+s.roll_num);
        }
//        kalpesh  5
//        tejas  4
//        ayush  3
//        nishant  2
//        om  1

       // ---------------------------------------------------------------------------------------------------------------------
//        Sort by Name, then CGPA
//
//        Imagine:
//
//        Ayush  10
//        Ayush  12
//        Kalpesh 9
//        Kalpesh 11
//
//        First sort by name.
//
//        If names are equal, sort by cgpa.
//
//        list.sort(
//                Comparator.comparing((Student s) -> s.name)
//                        .thenComparingInt(s -> s.cgpa)
//        );
//
//        Result:
//
//        Ayush 10
//        Ayush 12
//        Kalpesh 9
//        Kalpesh 11
//        Sort by CGPA, then Name
//        list.sort(
//                Comparator.comparingInt((Student s) -> s.cgpa)
//                        .thenComparing(s -> s.name)
//        );
//        Sort by Name, then CGPA, then Roll Number
//        list.sort(
//                Comparator.comparing((Student s) -> s.name)
//                        .thenComparingInt(s -> s.cgpa)
//                        .thenComparingInt(s -> s.roll_num)
//        );
//
//        Think of it like:
//
//        Teacher: Arrange students by NAME.
//        If two names are same?
//                Teacher: Then CGPA.
//                If CGPA is also same?
//        Teacher: Then ROLL NUMBER.
//
//                Java checks the next rule only when the previous rule gives a tie.
//
//

    }
}
