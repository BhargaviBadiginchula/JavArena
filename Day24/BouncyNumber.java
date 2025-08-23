import java.util.Scanner;
public class BouncyNumber {
    public static boolean isBouncy(int num){
        boolean increasing=false;
        boolean decreasing=false;
        if(num<100) return false;
        int prevDigit=num%10;
        num/=10;
        while(num>0){
            int curDigit=num%10;
            if(curDigit<prevDigit)increasing=true;
            if(curDigit>prevDigit)decreasing=true;
            if(increasing&&decreasing)return true;
            prevDigit=curDigit;
            num/=10;
        }return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        sc.close();
        if(isBouncy(num)){
            System.out.println("it is a bouncy number");
        }
        else{
            System.out.println("not a bouncy number");
        }
    }
}