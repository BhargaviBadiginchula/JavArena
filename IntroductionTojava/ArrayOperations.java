import java.util.Arrays;
public class ArrayOperations{
   public static void main(String[] args){
     int array[]={2,4,5,6,9,3};
     int copy[]=new int[array.length];
     for(int a=0;a<array.length;a++){
        copy[a]=array[a];
     }
   System.out.println(Arrays.toString(copy));
      //reversing array;
  int rev[]=new int[array.length];
  for(int a=copy.length;a>=0;a--)
  {
    rev[a]=array[a];
   }
System.out.println("reversed array:- "+Arrays.toString(rev));
}
}