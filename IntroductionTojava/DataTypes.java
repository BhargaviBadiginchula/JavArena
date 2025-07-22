public class DataTypes {
    public static void main(String[] args){
        //integers:
        byte xs=126;
        short x=232;
        int m=1232456;
        long l=98675463524345678l;
        float f=978.299876f;
        double d=626.87353253535;
        char ch=98;
        boolean out=true;
        System.out.println("byte "+ xs+" Short "+x+" int "+m+" long "+l+" f "+f+" double "+d+ " char "+ ch+" boolean "+out)


        //Size of variables Using Wrapper Classes
        /*Wrapper Classes are created to make java fully object oriented because primitive datatypes make java not fully object oriented. */

        System.out.println("Size of byte: " + Byte.SIZE + " bits");
        System.out.println("Size of short: " + Short.SIZE + " bits");
        System.out.println("Size of int: " + Integer.SIZE + " bits");
        System.out.println("Size of long: " + Long.SIZE + " bits");
        System.out.println("Size of float: " + Float.SIZE + " bits");
        System.out.println("Size of double: " + Double.SIZE + " bits");
        System.out.println("Size of char: " + Character.SIZE + " bits");

        // Boolean does not have a defined size in Java
        System.out.println("Size of boolean: JVM dependent (not defined explicitly)");
    }
    
}
