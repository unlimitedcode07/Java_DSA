public class p1 {
    public static int num(int a) {
        int num = 0;
        int i = 0;
       while(a !=0){
         num = num +(a%10)*(int)Math.pow(2, i);
         a = a/10;
         i++;
       }
        return num;
    }
    public static void main(String[] args) {
        int a = 0111001;
        System.out.println(num(a)); // 14
    }
}
