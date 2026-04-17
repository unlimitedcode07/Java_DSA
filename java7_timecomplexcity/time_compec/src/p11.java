
//insertion sort
//see in yt
//{45,2,7,4,9,1,9,5,7};
//{45}{2,7,4,9,1,9,5,7};
// check if 2 is less than 45 yes then swit
//{2}{45,7,4,9,1,9,5,7}
//check pass then
//{2,45}{7,4,9,1,9,5,7}
//check if 7is less then 45 and swip so on


//ts
//best=O(n)// same as bubble // this when arr is soeted
//av=O(n'2)
//worst=O(n'2)

//axilary space
//O(n)

//imp
// insertion and bubble is stable srt and selection is unstable
// cuse repeted element ka sequence galat hota hai
public class p11 {
    public static void main(String[] args) {
       int[] arr = {45,2,7,4,9,1,9,5,7};
       for(int i = 1; i<arr.length; i++){
           int j = i;
           while(j>0 && arr[j] < arr[j-1]){
               int temp = arr[j];
               arr[j]  = arr[j-1];
               arr[j-1] = temp;
               j--;
           }
       }
       for(int el : arr){
           System.out.print(el+" ");
           //1 2 4 5 7 7 9 9 45
       }
    }
}
