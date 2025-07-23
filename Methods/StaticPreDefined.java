public class StaticPreDefined {
    public static void main(String[] args) {
        // Using static method from String
        String languages = String.join(" Bharg ", "Java", "Python", "C++");
        System.out.println("Joined Languages: " + languages);

        // Using static method from Math
        int maxVal = Math.max(10, 25);
        double sqrtVal = Math.sqrt(49);

        System.out.println("Maximum value: " + maxVal);
        System.out.println("Square root of 49: " + sqrtVal);
    }
}
