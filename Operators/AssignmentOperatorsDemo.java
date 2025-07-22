public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("a and b : "+a+" "+b);
        a += b; // a = 15
        System.out.println("a+=b : "+a);
        a -= b; // a = 10
        System.out.println("a-=b : "+a);
        a *= b; // a = 50
        System.out.println("a*=b : "+a);
        a /= b; // a = 10
        System.out.println("a/=b : "+a);
        a %= b; // a = 0

        System.out.println("a%=a : " + a);
    }
}