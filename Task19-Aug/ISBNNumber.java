
import java.util.Scanner;
public class ISBNNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a valid isbn number");
        String num=sc.next();
        sc.close();
        if(num.length()!=10){
            System.out.println("The ISBN number is not valid");
            return;
        }
        int sum=0;int wt=10;
        for(int i=0;i<num.length();i++){
            int digit=Character.getNumericValue(num.charAt(i));
            sum+=digit*wt;
            wt--;   
        }
        if(sum%11==0){
            System.out.println("The ISBN number is valid ISBN");
        }else{
            System.out.println("The ISBN number is not valid");
        }
    }
}
