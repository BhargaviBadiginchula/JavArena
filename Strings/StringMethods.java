import java.util.Arrays;
public class StringMethods{
  public static void main(String[] args){
    String s1="Bhargavi Badiginchula";//using iteral 

    String s2=new String("Bhanu Kshatriya");//using Constructor
    System.out.println("char at index value 2:- "+s1.charAt(2));
    System.out.println("String2 length :- "+s2.length());

    String upper=s2.toUpperCase();//here we need to store string into another string because String is immutable which means we can perform operations but they does not result in original as we see in this example .So StringBuilder and StringBuffer classes are introduced to make Strings mutable;
    System.out.println("uppercase of string 2:- "+upper); 
   
    System.out.println("lowercase of String 2 :- "+upper.toLowerCase());
    String copy=s2;
    System.out.println("euality of Strings :- "+s2.equals(copy));
    System.out.println("equality String ignoring case:-"+s2.equalsIgnoreCase(upper));
    System.out.println("comparing strings :- "+"listen".compareTo("list"));
    System.out.println("checking sub-strings :- "+s2.contains("sha"));
    System.out.println("checking if strings startswith a sequence :- "+s1.startsWith("B"));
    System.out.println("checking strings endswith a suffix :- "+s1.endsWith("a"));
    System.out.println("substring of string :- "+s1.substring(9));
    System.out.println("substring of  strings with start and end indices :- "+"Bhanu Venkata Prasad".substring(6,13));
    System.out.println("indexOf strings :- "+s1.indexOf("i"));
    System.out.println("last index of strings :- "+s1.lastIndexOf("i"));
    System.out.println("replace in strings :- "+s1.replace("Bhargavi","Bhanu"));
    System.out.println("replace in strings :- "+s1.replaceAll(".","_"));
    String a[]=s2.split("a");
    System.out.println("split strings :- "+Arrays.toString(a));
    System.out.println("chararray of string :- "+Arrays.toString(s2.toCharArray()));
    s2="   Bhanu   ";
   System.out.println("A string with white spaces :- "+s2);
    System.out.println("trims white spaces in the string :- "+s2.trim());
    String mt="";
    System.out.println("checking whether the string is empty or not:- "+mt.isEmpty());
    mt="  ";
    System.out.println("checking whether the string is blank:- " +mt.isBlank());
    mt="bharv";
    System.out.println("srting using repeat():- " +mt.repeat(5));
    System.out.println("join method in String:- " +String.join("_","Bhargavi","nani","tarak"));




   
   }
} 
