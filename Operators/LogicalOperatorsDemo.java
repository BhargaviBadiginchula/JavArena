public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("Logical Operators in Java for values "+a +" "+b);

        // AND (&&) - true only if both are true
        System.out.println("a && b = " + (a && b)); // false
        System.out.println("a && true = " + (a && true)); // true
        System.out.println("b && false = " + (b && false)); // false

        // OR (||) - true if at least one is true
        System.out.println("a || b = " + (a || b)); // true
        System.out.println("a || false = " + (a || false)); // true
        System.out.println("b || false = " + (b || false)); // false

        // NOT (!) - inverts the value
        System.out.println("!a = " + (!a)); // false
        System.out.println("!b = " + (!b)); // true

        // Combined Logic
        boolean result = !(a && b) || (a && !b);
        System.out.println("Combined: !(a && b) || (a && !b) = " + result); // true
    }
}
