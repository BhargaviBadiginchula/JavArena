public class NonStaticBuiltIn {
    public static void main(String[] args) {
        String name = "Bhargavi";

        // Non-static methods from String class
        int length = name.length();
        char firstChar = name.charAt(0);
        String upper = name.toUpperCase();

        System.out.println("Length: " + length);
        System.out.println("First Character: " + firstChar);
        System.out.println("Uppercase: " + upper);
    }
}