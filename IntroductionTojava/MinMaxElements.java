import java.util.Arrays;
public class MinMaxElements{
  public static void main(String[] args){
   int array[]={12,54,24,67};
   int max=0;int min=0;
   for(int a:array){
    if(max<a){
       max=a;
    } 
}
min=max;
for(int a:array){

    if(min>a){
     min=a;
   }
}
System.out.println("max element is "+max);
System.out.println("min element is "+min);


//using single loop;
max=array[0];
min=array[0];
for(int a:array){
  if(max<a){
    max=a;
  }
if(min>a){
  min=a;
}
}
System.out.println("using single for loop ");
System.out.println("max element is "+max);
System.out.println("min element is "+min);
System.out.println("using sort ");
Arrays.sort(array);
System.out.println("max element is "+array[0]);
System.out.println("min element is "+array[array.length-1]);

}
}