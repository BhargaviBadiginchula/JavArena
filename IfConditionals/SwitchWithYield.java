import java.util.Scanner;
public class SwitchWithYield{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your score between (1-10)");
    int score=sc.nextInt();
    String grade =switch(score){
     case 10 ->{
     System.out.println("perfect ");
     yield "you got an A++";}
     case 9->{
     System.out.println("good ");
     yield "you  got an A";}
     
     case 8->{
     System.out.println("well ");
     yield "you got B";}
     
    case 7->{
     System.out.println("work better ");
     yield "you got C";}
   default ->{
    System.out.println("needs improvement");
    yield "you got D";
  }
};System.out.println(grade);
}
}
