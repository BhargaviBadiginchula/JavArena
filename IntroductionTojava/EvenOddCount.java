public class EvenOddCount{
   public static void main(String[] args){
     int arr[]={43,56,46,76,21,47,95,97};
     int oddCount=0;int evenCount=0;
     for(int a : arr){
       if(a%2==0){
          evenCount++;
       }
       else{
         oddCount++;
      }
   }
  System.out.println("Even elements count : "+evenCount);
  System.out.println("Odd elements count : "+oddCount);
}
}