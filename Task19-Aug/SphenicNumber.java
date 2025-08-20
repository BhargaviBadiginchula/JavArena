import java.util.Scanner;
class SphenicNumber{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check whether th enumber is Sphenicc or not");

        int num=sc.nextInt();
        int org=num;
        sc.close();
        int product=1;
        int count=0;
        for(int i=2;i<=num;i++){
            if(num%i==0 &&isPrime(i)){
                count++;
                product*=i;
                num/=i;
            }
            
        }
        if(product==org && count==3){
            System.out.println("number is a Spheric Number");
        }else{
            System.out.println("number is not a Spheric Number");
        }
    }
    public static boolean isPrime(int n){
        boolean prime=true;
        if(n<=1){
            return false;
        }for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
}