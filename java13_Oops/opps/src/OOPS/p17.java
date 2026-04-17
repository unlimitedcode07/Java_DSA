package OOPS;
//complex number
class ComplexNum{
   int x ;
   int y ;
   ComplexNum(int x, int y){
       this.x = x;
       this.y = y;
   }
   void print(){
       if(y>=0) System.out.println(this.x +" + "+this.y+"i");
       else System.out.println(this.x +" - "+(- this.y)+"i");
   }
   void add(ComplexNum c){
       this.x = this.x + c.x;
       this.y = this.y + c.y;
   }
   void multiply(ComplexNum c){
       System.out.println("00");
       x = x*c.x -y*c.y;
       y = x*c.y + c.x*y;

   }
}
public class p17 {
    public static void main(String[] args) {
        //print cn
        ComplexNum c1 = new ComplexNum(1,3);
        c1.print(); //1 + 3i
        ComplexNum c2 = new ComplexNum(2,-3);
        c2.print();//2 - 3i

        //adding 1 complex no to other
        c1.add(c2);
        c1.print(); //3 + 0i

        //multiply cn
        c1.multiply(c2);
        c1.print(); //6 - 18i
    }
}
