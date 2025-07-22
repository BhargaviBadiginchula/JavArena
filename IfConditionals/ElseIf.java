import java.util.Scanner;
public class ElseIf{
   public static  void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no.of unit consumed");
      int units=sc.nextInt();
     int bill=0;int meterCharge=50;
     
      if(units<=100){
        bill=units*2;
      }
      else if(units>100 || units<=200){
         bill=units*3;
       }
      else if(units>200 || units<=300){
         bill=units*4;
       }
     else{
       bill=units*5;
     }
int totalBill=bill+meterCharge;

System.out.printf("no. of units consumed is%d, total generated bill %d",units,totalBill);
  }
}
   