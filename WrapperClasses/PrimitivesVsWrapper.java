public class PrimitivesVsWrapper {
    public static void main(String[] args) {
        byte z = 12;
        short y = 1323;
        Integer c = 1089754342;
        int x = c; // Auto-unboxing
        long w = 98763248976L;
        float v = 76543.87654f;
        double u = 87865.89765454356;
        char t = 'r';
        boolean s = true;

        System.out.println("Primitives");
        System.out.println("==".repeat(10));
        System.out.println(z + "\n" + y + "\n" + x + "\n" + w + "\n" + v + "\n" + u + "\n" + t + "\n" + s);

        Byte a = 12;
        Short b = 1323;
        Long d = w; // Auto-boxing
        Float e = 76545345.87654f;
        Double f = 897654.987654325678;
        Character g = Character.valueOf(t); // Manual boxing
        System.out.println("Demo of Manual Boxing: " + g);
        Boolean h = false;

        System.out.println("Wrapper Objects");
        System.out.println("==".repeat(10));
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f + "\n" + g + "\n" + h);

        System.out.println("Auto-unboxing comparison (y == b): " + (y == b)); // b is unboxed to short
        Integer i = x; // Auto-boxing again
        Double m = f.doubleValue(); // Manual unboxing
        System.out.println("Demo of Manual Unboxing: " + m);

        System.out.println("Using equals(): " + c.equals(i)); // Value-based object comparison
    }
}
