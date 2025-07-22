public class SumOfArrayElements{
   public static void main(String[] args){
      int []array={2,4,5,6,8};
      int  sum=0;int count =0;
   //summing array elements using for each loop
     for(int a:array){
        sum+=a;
        count++;
     }
    System.out.println("sum of array elements :- "+ sum);

     // Average of arrray elements
   System.out.println("Average of array elements :- "+ sum/count);
   //otherwise using length property;
  System.out.println("Average using length parameter "+sum/(array.length));

}
}