import java.util.HashSet;

public class p1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(45);
        set.add(78);
        set.add(98);
        set.add(56);
        set.add(54);
        System.out.println( set.contains(98));
        System.out.println(set.size()); //6
        set.add(56); // if we add diblicat the set womt add
        // store unique element ;
        System.out.println(set.size()); //6

        // set.clear();  to remove all element
        System.out.println(set);//[2, 98, 54, 56, 45, 78]
        System.out.println(set.remove(98)); // remove
        System.out.println(set);//[2, 54, 56, 45, 78]

    }
}
