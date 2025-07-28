import java.util.Arrays;

public class NonRepetitive {
    public static void main(String[] args) {
        String str = "BhargaviBadiginchula";
        str = str.toLowerCase(); // Case-insensitive
        char[] a = str.toCharArray();
        Arrays.sort(a); // Sorting helps group same characters

        int i = 0;
        System.out.println("Non-repetitive character occurrences: ");

        while (i < a.length) {
            int count = 1;
            while (i < a.length - 1 && a[i] == a[i + 1]) {
                count++;
                i++;
            }

            if (count == 1) {
                System.out.print(a[i] + " ");
            }

            i++; 
        }
    }
}