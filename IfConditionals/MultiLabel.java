import java.util.Scanner;
public class MultiLabel{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
System.out.println("enter a month name ");
    String month=sc.nextLine();
    switch(month){
      case "february","march" ->System.out.println("Spring");
      case "april","may","june" ->System.out.println("Summer");
      case "july","august","september" ->System.out.println("Monsoon");
      case "october","november" ->System.out.println("Autumn");
      case "december","january" ->System.out.println("Winter");
   default ->System.out.println("enter a valid month");
      }
   }
}