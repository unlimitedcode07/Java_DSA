//q =>
// given an array of size n+1 consisting of integers from 1 to n .
// One of the element is duplicate in the array. find that duplicaye element.

public class p1 {
    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,4};

        boolean[] seen = new boolean[arr.length + 1];
        // seen = [t,t,t,t,t,f]
   //arr.length+1 cause o is not there ok and we are using arr element val s index thats why
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (seen[x] == true) {
                System.out.println("Duplicate is " + x);
                break;
            }

            seen[x] = true;
        }
    }
}
