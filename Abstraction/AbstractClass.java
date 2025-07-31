abstract class Coder{ 
   int x=10;                    //instance variable
   static String name="Kshatriya";//static variable
   final int number=10;           //final variable
   
  Coder(){             //Constructor
    this.x=20;
  }


   public abstract void develop();  //Abstract Methods
    
   public abstract void validate(); 



   public void concrete(){        // Instance Method
    System.out.println("just a regular method");
   }


   public static void concrete1(){  //Static methods
    System.out.println("another regular method");
   }

}
class Developer extends Coder{ 

  Developer(){
   super();
  } 


  public void develop(){
    System.out.println("developed a software");//impementation of abstract methods
  }
  public void validate(){
    System.out.println("validated the software");
  }
}
public class AbstractClass{
  public static void main(String[] args){
    Coder v=new Developer();  //parent refernce-child object
    Developer u=new Developer();//child object of child type
    v.develop();    //calling using parent refernce
    u.validate();//calling using child ref
    v.concrete(); //calling using parent ref
    Coder.concrete1();//calling using class since it is a static method
    System.out.println("x value:- "+v.x);//acceesing instance variable with parent reference
    System.out.println("name :- "+Coder.name);//accessing abstarct static var (name) using class name
    System.out.println("final variable number:- "+v.number); //accessing final variable   
  }
}