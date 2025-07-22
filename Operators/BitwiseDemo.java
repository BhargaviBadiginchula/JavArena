public class BitwiseDemo {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011
        System.out.println("a  and b are: "+a+" "+b );
        System.out.println("a & b = " + (a & b)); // 0001 => 1
        System.out.println("a | b = " + (a | b)); // 0111 => 7
        System.out.println("a ^ b = " + (a ^ b)); // 0110 => 6
        System.out.println("~a = " + (~a));       // 1010 => -6
    }
}