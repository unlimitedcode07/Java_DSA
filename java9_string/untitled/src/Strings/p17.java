package Strings;
// reverse in string buildr
//  see down to see reverse in string buy all method
// in method string me reverse method nahi hota string builder mehi hota hai
public class p17 {
    public static void main(String[] args) {
        String s = "kalpesh";
        StringBuilder kp  = new StringBuilder(s);
        System.out.println(kp); //kalpesh

        kp.reverse();
        System.out.println(kp); //hseplak

        /// //////////////////////////////////////////
        // normal reverse string
        String og2 = "reverse";
        StringBuilder og = new StringBuilder(og2);
        System.out.println(og); //reverse
        int i = 0;
        int j = og.length()-1;

        while(i<j){
           char st = og.charAt(i);
           char ed = og.charAt(j);
           og.setCharAt(i,ed);
           og.setCharAt(j,st);
           i++;
           j--;
        }
        System.out.println(og);
        //esrever

        //2nd
//        String s = "hello";
//        String rev = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev = rev + s.charAt(i);
//        }
//
//        System.out.println(rev); // olleh


        // thsi is 3rd
//        String s = "hello";
//        String rev = new StringBuilder(s).reverse().toString();


    }
}
//////////////////////////////////////////////////////////////////////////////////////////////
//reverse
//1/🔹 In StringBuilder
//StringBuilder kp = new StringBuilder("kp");
//kp.reverse();
//System.out.println(kp);

//✅ Option 1: Using StringBuilder (most common)
//String s = "kp";
//String reversed = new StringBuilder(s).reverse().toString();
//goodBest and simplest way

//✅ Option 2: Manual way (loop)
//String s = "kp";
//String rev = "";
//
//for (int i = s.length() - 1; i >= 0; i--) {
//rev += s.charAt(i);
//}
//
//        System.out.println(rev);
//👉 Works, but ❌ inefficient (creates many objects)

//✅ Option 3: Using char array
//String s = "kp";
//char[] arr = s.toCharArray();
//
//for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
//char temp = arr[i];
//arr[i] = arr[j];
//arr[j] = temp;
//}
//
//String rev = new String(arr);
//System.out.println(rev);
//✔️ Efficient, no extra objects




