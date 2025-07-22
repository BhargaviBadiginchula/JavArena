// Program to demonstrate continue statement
public class Continue {
    public static void main(String[] args) {
        System.out.println("Printing numbers skipping 5 using continue:");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skips printing when i is 5
            }
            System.out.print(i + " ");
        }
    }
}
