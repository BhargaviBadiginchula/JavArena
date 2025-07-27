public class ConstructorTask{
  //Setting values for Book Attributes:
   String author;
   String title;
   int year;
  
   ConstructorTask(){
    this.author="Not Available";
    this.title="Not Available";
    this.year=0;
    }
    
  //Parameterized(accepts two values
  
  ConstructorTask(String a,String b){
   this.author=a;
   this.title=b;
   this.year=2024;
 }
//overloading
  ConstructorTask(String a,String b,int c){
   this.author=a;
   this.title=b;
   this.year=c;
  
 }
public void show(){
  System.out.println("Title :- "+title+" Author:- "+ author+" Year "+year);
}
 
public static void main(String[] args){
  ConstructorTask d=new ConstructorTask();
  ConstructorTask p1=new ConstructorTask(" Effective java","Joshua Bloch"); 
  ConstructorTask p2=new ConstructorTask("Java: The Complete Reference","Herbert Schildt");
  d.show();

  p1.show();
 
  p2.show();
}
}