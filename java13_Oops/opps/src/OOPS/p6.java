
// polymorphism => ek nam 3 kam

package OOPS;

public class p6 {
    public static class Dog{
        void speak(){
            System.out.println("bhu bhu");
        }
    }
    public static class Cat{
       void speak(){
           System.out.println("meo meo");
       }
    }
    public static class Lion{
       void speak(){
           System.out.println("khoo khoo");
       }
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Lion l = new Lion();

        d.speak();
        c.speak();
        l.speak();
//        bhu bhu
//        meo meo
//        khoo khoo
    }
}
