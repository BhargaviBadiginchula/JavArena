import java.util.Scanner;
public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        long sum=0; 
        int s=0;

        // Sum of natural numbers
        sum = n*(n+1)/2;
        for(int i=0;i<=n;s+=i,i++);
        if(sum==s)
            System.out.println("Sum of n natural numbers = " + sum);

        // Sum of squares of n natural numbers
        sum=0;
        int sumOfSquares = n*(n+1)*(2*n+1)/6;
        for(int i=0;i<=n;sum+=i*i,i++);
        if(sum==sumOfSquares)
            System.out.println("Sum of squares of n natural numbers = " + sumOfSquares);

        // Sum of cubes of n natural numbers
        sum=0;
        int sumOfCubes = (n*(n+1)/2)*(n*(n+1)/2);
        for(int i=0;i<=n;sum+=i*i*i,i++);
        if(sum==sumOfCubes)
            System.out.println("Sum of cubes of n natural numbers = " + sum);

        // Sum of Arithmetic Progression (AP)
        System.out.println("Enter first term (a) for AP:");
        int a=sc.nextInt();
        System.out.println("Enter common difference (d):");
        int d=sc.nextInt();
        sum=0;
        int apSumFormula = (n * (2 * a + (n - 1) * d)) / 2;
        for(int i=0;i<n;sum+=a+i*d,i++);
        if(sum==apSumFormula)
            System.out.println("Sum of Arithmetic Progression = " + sum);

        // Sum of Geometric Progression (GP)
        System.out.println("Enter first term (f) and common ratio (r):");
        int f=sc.nextInt();
        int r=sc.nextInt();
        sum=0;
        // Formula for GP sum when r != 1
        int gpSumFormula = (int)(f * (Math.pow(r,n) - 1) / (r - 1));
        for(int i=0;i<n;sum += f * Math.pow(r, i), i++);
        if(sum==gpSumFormula)
            System.out.println("Sum of Geometric Progression = " + sum);

        // Harmonic Sum
        double hSum=0.0;
        for(int i=1;i<=n;hSum+=1.0/i,i++);
        System.out.println("Harmonic Sum = " + hSum);

        sc.close();
    }
}
