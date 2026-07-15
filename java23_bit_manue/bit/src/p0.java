//     Bit position
//
//        3 2 1 0
//        ---------
//        1 1 0 1


public class p0 {
    //  number to binary
    static int getBinary(int val){
        String s = "";
        while(val != 1){
           s = val%2 +s ;
           val = val/2;
        }
        return Integer.valueOf("1"+s);
    }
    public static void main(String[] args) {
        int a = 15;
        int i = 1;
        while(i!=a){
            System.out.println(i+": "+getBinary(i));
            i++;
        }
//        1: 1
//        2: 10
//        3: 11

//        4: 100

//        5: 101
//        6: 110
//        7: 111

//        8: 1000

//         9: 1001
//        10: 1010
//        11: 1011
//        12: 1100
//        13: 1101
//        14: 1110

    }
}
