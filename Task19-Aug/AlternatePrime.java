import java.util.Scanner;
class AlternatePrime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt(); 
        sc.close();
        System.out.println("Alternate Prime Numbers between range:"+num);
        boolean skip=false;
        for(int a=2;a<=num;a++){
            
            if(isPrime(a)){
                if(!skip){
                    System.out.print(a+" ");
                }
                skip=!skip;
            }
        }
        
    }
    public static boolean isPrime(int n){
        
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        } return true;
    }
}