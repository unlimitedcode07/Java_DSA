package OOPS;
import java.util.*;

public class p13 {
 static  class StudentData{

        int[] marks;
        StudentData(int[] x){
            marks = Arrays.copyOf(x,x.length);
        }
//                 /\
//                 ||
//        this both are difference  if we print arr[0] in both upper par the val of arr in main dont change cause we copy and place to new arry but for down we make a shallow copy and val of arr change
//                 ||
//                 \/
//        StudentData(int[] y){
//            marks = y;
//        }
    }
    public static void main(String[] args) {
       int[] arr = {1,2,2,3,5,6};
       StudentData c = new StudentData(arr);
       c.marks[0] = 4;
        System.out.println(arr[0]);
        // 1    if used 2nd constructure this down
//        StudentData(int[] y){
////            marks = y;
////        }
//        the arr[0] change to 4
    }

    // shallow copy means if a = b then if changes don in a can reflect in b

}
