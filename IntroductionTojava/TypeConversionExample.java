
public class TypeConversionExample {
    public static void main(String[] args) {

        System.out.println("Widening Conversions (Implicit):");

        byte byteVal = 10;
        short shortVal = byteVal;   // byte -> short
        int intVal = shortVal;      // short -> int
        long longVal = intVal;      // int -> long
        float floatVal = longVal;   // long -> float
        double doubleVal = floatVal; // float -> double

        System.out.println("byte to short: " + shortVal);
        System.out.println("short to int: " + intVal);
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);

        System.out.println("\n Narrowing Conversions (Explicit):");

        double doubleNum = 123.456;
        float floatNum = (float) doubleNum;  // double -> float
        long longNum = (long) floatNum;      // float -> long
        int intNum = (int) longNum;          // long -> int
        short shortNum = (short) intNum;     // int -> short
        byte byteNum = (byte) shortNum;      // short -> byte

        System.out.println("double to float: " + floatNum);
        System.out.println("float to long: " + longNum);
        System.out.println("long to int: " + intNum);
        System.out.println("int to short: " + shortNum);
        System.out.println("short to byte: " + byteNum);

        System.out.println("\n Real-life Case: char and int");

        char ch = 'A';
        int ascii = ch;  // widening char to int
        char ch2 = (char) (ascii + 1); // narrowing int to char

        System.out.println("char to int (ASCII of 'A'): " + ascii);
        System.out.println("int to char (next character): " + ch2);
    }
}
