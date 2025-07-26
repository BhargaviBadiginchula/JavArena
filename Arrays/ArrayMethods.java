import java.util.*;
public class ArrayMethods{
   public static void main(String[] args){
     //setting array values;
     int arr1[]={8,3,5,7,4};//mannualy assigning array (static)
     System.out.println("Static Array initialization mannually :-"+Arrays.toString(arr1));

/*if we try to print arr in s.o.p(arr1),it will return an address of array object.As
 Symbol      Meaning                                   
 `[`         It's an array                             
 `I`         Data type = `int` (`I` for integer)      
 `@`         Separator between type and memory address 
 `1b6d3586`  Hash code of the object in hexadecimal    
.*/

     System.out.println("Static Array initialization mannually :-"+arr1);
     int arr2[]=new int[5];//dynamically assigning values using Math library.
     for(int i=0;i<arr2.length;i++){
        arr2[i]=(int)(Math.random()*10);
     }
      
     //Accessing arrays values using indices;
    System.out.println("Accessing index value at 3 :-"+arr1[3]);
     Scanner sc=new Scanner(System.in);
    //Updating array using indices
   arr1[3]=9;
   System.out.println("updating 3 index value to 9:- "+arr1[3]);
     int []arr3=new int[5];
     System.out.println("enter values into the array");
     for(int i=0;i<arr2.length;i++){
        arr3[i]=sc.nextInt();
     }

    //sorting an array
     System.out.println("before Sorting:- "+Arrays.toString(arr2));
     Arrays.sort(arr2);
     System.out.println("after Sorting:- "+Arrays.toString(arr2));
    


   //copyOf()
   System.out.println("Array 3:- "+Arrays.toString(arr3));
   int []arr4=Arrays.copyOf(arr3,5);
   System.out.println("copied array3 into array4 :- "+Arrays.toString(arr4));
  
   //equals()
   System.out.println("euality of arr3 and arr4 :- "+Arrays.equals(arr3,arr4));


   //Arrays.fill()  to fill an arrray with soecified values
   int  arr5[]=new int[5];
   Arrays.fill(arr5,6);
   System.out.println("Array fill():- "+Arrays.toString(arr5));

   //Copying a range of arrays
   arr4=Arrays.copyOfRange(arr3,1,5);
   System.out.println("Array copyOfRange():- "+Arrays.toString(arr4));
   
   //Arrays.setAll();
   Arrays.setAll(arr3,i->i+4);
   System.out.println("setting array values using lambda unary opeartor:- "+Arrays.toString(arr3));
   
   Arrays.parallelSort(arr1);
   System.out.println("Parallel Sort:- "+Arrays.toString(arr1));//3,4,5,7,8
   arr3=arr1;
   arr3[3]=19;
   System.out.println("Mismatch of Arrays:- "+Arrays.mismatch(arr1,arr3));
   
   System.out.println("Mismatch of Arrays:- "+Arrays.toString(arr1));//here output is -1 because both refenced to same object.
   

  //MultiDimensional Arrays
  //Creation of 2D
   int col=3;int row=3;
  int c[][]={{2,3,4},{3,5,6},{8,6,4}};
  System.out.println("printing array using for each loop:- ");
  for(int a[]:c){
   for(int v:a){
      System.out.print(v+" ");
   }System.out.println();
}
  int [][]b=new int[row][col];
  
  //Assigning values using for loop;
  for(int i=0;i<b.length;i++){
   for(int j=0;j<=i;j++){
     b[i][j]=(int)(Math.random()*10);
  }
 }System.out.println("printing 2 dimensional array :- "+Arrays.deepToString(b));

int d[][]=Arrays.copyOf(b,b.length);
System.out.println("checking equality:- "+Arrays.deepEquals(d,b));
  


 int[][] jagged = new int[3][]; // 3 rows

 // Assign different lengths to each row
 jagged[0] = new int[]{1, 2};
 jagged[1] = new int[]{3, 4, 5, 6};
 jagged[2] = new int[]{7, 8, 9};

 // Printing the jagged array
 for (int i = 0; i < jagged.length; i++) {
 System.out.print("Row " + i + ": ");
 for (int j = 0; j < jagged[i].length; j++) {
 System.out.print(jagged[i][j] + " ");
  }
  System.out.println();}
}

}