//checking eligibity to work.
import java.util.Scanner;
public class IfElse{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your age");
      int age=sc.nextInt();
      if(age>=18){
        System.out.println("you are permitted to work");
      }
      else{
        System.out.println("you are not permitted to work");
      }
   }
}
