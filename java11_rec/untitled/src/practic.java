public class practic {

    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';
        honay(8,a,b,c);
    }

    public static void honay(int n, char a, char b, char c){
        if(n == 0){
            return;
        }
        System.out.println("1st "+"n:"+n+" a:"+a+" b:"+b+" c:"+c);
        honay(n-1, a, c, b);
        System.out.println("2st "+"n:"+n+" a:"+a+" b:"+b+" c:"+c);
        System.out.println(a+"->"+c);
        honay(n-1, b, a, c);
        System.out.println("3st "+"n:"+n+" a:"+a+" b:"+b+" c:"+c);
    }

}