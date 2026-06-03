package OOPS;
//FractionClasss  => newmarator/denominator
class fractionClass{
    int n;
    int d;

    fractionClass(int n , int d){
        this.n = n;
        this.d = d;
        simplify();
    }

    void print(){
        System.out.println(n+"/"+d);
    }

    void  add(fractionClass f){
        this.n = n*f.d + f.n*d;
        this.d = d*f.d;
        simplify();
    }
    void simplify(){
       int gcd = hcf(n,d);
       this.n = n/gcd;
       this.d = d/gcd;
    }
    int hcf(int a , int b){
        if(a == 0) return b;
        return hcf(b%a,a);
    }
}

public class p18 {
    public static void main(String[] args) {
        fractionClass t1 = new fractionClass(4,5);
        t1.print();
        fractionClass t2 = new fractionClass(4,5);
        t2.print();


        t1.add(t2);
        t1.print();

    }
}
