// Program to demonstrate break statement
public class Break {
    public static void main(String[] args) {
        System.out.println("Numbers until 5 using break:");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exits loop when i becomes 6
            }
            System.out.print(i + " ");
        }
    }
}
