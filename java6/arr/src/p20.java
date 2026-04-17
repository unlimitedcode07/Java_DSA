public class p20 {
    public static void main(String[] args) {
        int[] arr = {1,5,8,-3};
        //twosum(arr);
        System.out.println(twosum(arr));
       // found At1and3
    }

    public static String twosum(int[] y) {
        for(int i = 0; i<y.length; i++){
            for(int j= i+1; j<y.length; j++){
                if(y[i]+y[j] == 2 ){
                    return "found At"+i+"and"+j;
                }
            }
        }
        return "not found";
    }
}
