import java.util.Arrays;
public class Anagram{
 public static void main(String[] args){
   String s1=new String("Triangle");
   String s2=new String("Integral");
   char arr1[]=s1.toLowerCase().toCharArray();
   char arr2[]=s2.toLowerCase().toCharArray();
   Arrays.sort(arr1);
   Arrays.sort(arr2);
   if(Arrays.equals(arr1,arr2)){
     System.out.println("Strings are Anagram");
   }
  else{
    System.out.println("Strings are Anagram");
}
}
}
