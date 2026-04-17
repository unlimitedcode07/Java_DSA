
//search in mountain arr

public class p3 {
        public static int peakIndexInMountainArray(int[] arr) {
            int i = 0, j = arr.length - 1;

            while (i < j) {
                int mid = i + (j - i) / 2;

                if (arr[mid] < arr[mid + 1]) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            return i;
        }

    public static void main(String[] args) {
         int[] arr = {1,0,1};
        peakIndexInMountainArray(arr);
    }
}
