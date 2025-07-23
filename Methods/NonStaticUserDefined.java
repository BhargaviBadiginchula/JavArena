public class NonStaticUserDefined{
      // 1. Non-static with return and with parameters
    int multiply(int a, int b) {
        return a * b;
    }

    // 2. Non-static with return and without parameters
    String getFarewell() {
        return "Goodbye from non-static method!";
    }

    // 3. Non-static without return and with parameters
    void printCube(int x) {
        System.out.println("Cube: " + (x * x * x));
    }

    // 4. Non-static without return and without parameters
    void nonStaticMessage() {
        System.out.println("Non-static method without params or return");
    }

    public static void main(String[] args) {
        NonStaticUserDefined obj = new NonStaticUserDefined();

        System.out.println("Multiply: " + obj.multiply(4, 5));
        System.out.println(obj.getFarewell());
        obj.printCube(3);
        obj.nonStaticMessage();
    }
}