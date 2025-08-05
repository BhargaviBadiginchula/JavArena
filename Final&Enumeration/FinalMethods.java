class Student{
  final public void hi(){
     System.out.println("hello"); 
   }


  final public static void hello(){
     System.out.println("Good Morning");
  }
  final private void secret(){
    System.out.println("private and final");
  }
}//here private doesn't allow to override methods so it makes final redundant.
class Student1 extends Student{
   /* public void hi(){
     System.out.println("hello"); 
   } 


    public static void hello(){
     System.out.println("Good Morning");
  }

   method overriding for a final method is not possible"*/
}
public class FinalMethods{
  public static void main(String[] args){
     Student1 v=new Student1();
     v.hi();
     Student.hello();
  }
}