import java.util.ArrayList;
//Create a 2D ArrayList (Matrix) in Java and print it in matrix format.”
public class p9 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3); a.add(24); a.add(67); a.add(89);
        System.out.println(a);
        //[3, 24, 67, 89]

        ArrayList<Integer> b = new ArrayList<>();
        b.add(5); b.add(4); b.add(7); b.add(8);
        System.out.println(b);
        //[5, 4, 7, 8]

        ArrayList<Integer> c = new ArrayList<>();
        c.add(8); c.add(89); c.add(62); c.add(9);
        System.out.println(c);
        //[8, 89, 62, 9]

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.println(arr);
        //[[3, 24, 67, 89], [5, 4, 7, 8], [8, 89, 62, 9]]

        System.out.println("matrix format");
        // matrix format
        for(int i = 0 ; i<arr.size(); i++){

            for(int j = 0 ; j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

       }
}
