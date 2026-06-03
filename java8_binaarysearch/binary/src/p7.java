
//optima square
// we use long cause mid*mid exit int limit and we swit the datatype again with int cause we ginen to return in int

public class p7 {
    public static int root(int n){
        long i = 1;
        long j = n;
        long result = 0;
        while(i<=j){
            long mid = i+ (j-i)/2;
            System.out.println(mid);
            if(mid*mid == n){
                return (int)mid;
            }if(mid*mid > n){
                j= mid -1;
            }else{
                result = mid;
                i = mid + 1;
            }

        }
        return (int)result;
    }
    public static void main(String[] args) {
        int n = 625;
        System.out.println(root(n));

    }
}

