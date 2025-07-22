// Program to demonstrate return statement
public class Return {
    public static void main(String[] args) {
        checkEvenOrOdd(7);
        checkEvenOrOdd(12);
    }

    static void checkEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
            return; // exit method after printing
        }
        System.out.println(num + " is odd");
    }
}
