//package OOPS;
////about static
//
//class different{
//
//}
//
////💡 Access Rule:
////✔ No relation at all
////✔ Works independently
//
//public class p14 {
//    int x = 10;
//    static int y = 20;
//    static class StaticClass{
//        void print() {
//            System.out.println(x); //❌
//            System.out.println(y); // ✅
//        }
//    }
////    Access Rule:
////  ✔ Can access: Only static members of Outer
////
////❌ Cannot access: Non-static (x) → because no object
//
//    class NonStatic{
//        void print() {
//            System.out.println(x); //  ✅
//            System.out.println(y); // ✅
//        }
//    }
////        💡 Access Rule:
////        ✔ Can access: Outer non-static variables (x)
////                       Outer static variables
////        👉 Because it has outer object link
//
//    public static void main(String[] args) {
//
//    }
//}

//        | Type             | Needs Outer Object?  | Can access `x` (non-static)?  | Can access `static`?      |
//        | ---------------- | -------------------- | ----------------------------- | ------------------------- |
//        | Non-static Inner | ✅ Yes               | ✅ Yes                        | ✅ Yes                    |
//        | Static Inner     | ❌ No                | ❌ No                         | ✅ Yes                    |
//        | Separate Class   | ❌ No                | ❌ No (unless object passed)  | ❌ No (unless referenced) |
