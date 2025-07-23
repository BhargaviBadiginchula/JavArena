public class StaticUserDefined {

    // 1. Static with return and with parameters
    static int add(int a, int b) {
        return a + b;
    }

    // 2. Static with return and without parameters
    static String getGreeting() {
        return "Hello from static method!";
    }

    // 3. Static without return and with parameters
    static void printSquare(int x) {
        System.out.println("Square: " + (x * x));
    }

    // 4. Static without return and without parameters
    static void staticMessage() {
        System.out.println("Static method without params or return");
    }

    public static void main(String[] args) {
        System.out.println("Add: " + add(10, 20));
        System.out.println(getGreeting());
        printSquare(5);
        staticMessage();
    }
}
