import java.util.Arrays;
// merg sort
// tc : O(n* log n)

public class p7 {
    public static void main(String[] args) {
        int[] arr = {5,2,7,-8,12,56,32,11,9};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergesort(int[] arr) {
        int n = arr.length;
        if(n == 1) return ;
        //step 1: create 2 arr of n/2 and n-n/2
        int[] a = new int[n/2];
        int[] b = new int[n-(n/2)];
        int ind = 0;
        //step 2: copy the arr in to 2
        for(int i = 0; i<a.length; i++){
            a[i] = arr[ind++];
        }
        for(int i = 0; i<b.length; i++){
            b[i] = arr[ind++];
        }
        System.out.println(Arrays.toString(a)+" "+Arrays.toString(b));
        // magic :
        mergesort(a); mergesort(b);
        //merge
        System.out.println(Arrays.toString(arr));
        merg(a,b,arr);
    }

    public static void merg(int[] arr1, int[] arr2, int[] arr) {

        int i = 0; int j = 0; int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]) arr[k++] = arr1[i++];
            else arr[k++] = arr2[j++];
        }
        while(i<arr1.length) arr[k++] = arr1[i++];
        while(j<arr2.length) arr[k++] = arr2[j++];
        System.out.println(Arrays.toString(arr));
    }


}

/*
Merge Sort Recursion Tree for:
[5,2,7,-8,12,56,32,11,9]

                          [5,2,7,-8,12,56,32,11,9]
                       /                             \
            [5,2,7,-8]                               [12,56,32,11,9]
           /          \                             /               \
       [5,2]        [7,-8]                    [12,56]           [32,11,9]
      /    \        /    \                   /      \           /      \
    [5]   [2]     [7]   [-8]             [12]     [56]      [32]    [11,9]
                                                             /      \
                                                           [11]    [9]

------------------- MERGING BACK -------------------

[5] + [2] → [2,5]
[7] + [-8] → [-8,7]

→ [-8,2,5,7]

[12] + [56] → [12,56]
[11] + [9] → [9,11]

[32] + [9,11] → [9,11,32]

→ [12,56] + [9,11,32] → [9,11,12,32,56]

FINAL:
[-8,2,5,7] + [9,11,12,32,56]
→ [-8,2,5,7,9,11,12,32,56]
*/
/*
"C:\Program Files\Java\jdk-21\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.3.1\lib\idea_rt.jar=57540" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath D:\java\java12_sort\sort\out\production\sort p7
[5, 2, 7, -8] [12, 56, 32, 11, 9]
        [5, 2] [7, -8]
        [5] [2]
        [2, 5]
        [7] [-8]
        [-8, 7]
        [-8, 2, 5, 7]
        [12, 56] [32, 11, 9]
        [12] [56]
        [12, 56]
        [32] [11, 9]
        [11] [9]
        [9, 11]
        [9, 11, 32]
        [9, 11, 12, 32, 56]
        [-8, 2, 5, 7, 9, 11, 12, 32, 56]
        [-8, 2, 5, 7, 9, 11, 12, 32, 56]
*/