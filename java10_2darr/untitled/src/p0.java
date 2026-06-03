import java.util.*;

public class p0 {

    public static void main(String[] args) {
        // arrlist initialization
        ArrayList<Integer> list1 = new ArrayList<>();
//                                                /\
//                                                ||
//                                           what to store in this
//                                        size <t1 or itrable collection  <t2
//        first t1
       ArrayList<Integer> list2 = new ArrayList<>(10);
//       👉 This means:
//        Create empty list
//        Reserve space for 10 elements
//        Size is still 0

//         second t2
//        ArrayList<Integer> list3 = new ArrayList<>(arr);
//        👉 Here, arr is NOT size
//        👉 It must be a Collection (something iterable)

//        ✅ Valid things you can pass
//        1. Another List
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list1 = new ArrayList<>(list2);

//        2. Set
//        Set<Integer> set = new HashSet<>();
//        ArrayList<Integer> list = new ArrayList<>(set);

//        3. map.values()
//        ArrayList<Integer> list = new ArrayList<>(map.values());

//        4. map.keySet()
//        ArrayList<Integer> list = new ArrayList<>(map.keySet());

//        ❌ NOT allowed (your confusion)
//        Array ❌
//        Integer[] arr = {1,2,3};
//        new ArrayList<>(arr);  ❌ ERROR
//
//        👉 Because array is not a Collection

//        🔥 If you have array, do this instead
//        Integer[] arr = {1,2,3};
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

//        🔵 Side-by-side difference
//        new ArrayList<>(10)       // size capacity (empty list)
//        new ArrayList<>(arrList)  // copy elements
    }
}
