public class Unary {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("initial a value is: "+a);
        System.out.println("Post-increment a++ = " + (a++)); // prints 10, then a=11
        System.out.println("Pre-increment ++a = " + (++a));  // a=12

        System.out.println("Post-decrement a-- = " + (a--)); // prints 12, then a=11
        System.out.println("Pre-decrement --a = " + (--a));  // a=10

        boolean flag = true;
        System.out.println("!flag = " + (!flag));
    }
}