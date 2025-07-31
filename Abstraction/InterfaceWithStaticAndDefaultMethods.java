interface Vehicle{
  private  static void mode(){
   System.out.println("automated");
  }

  void start();//abstract Method
 
  static void displayType(){
   mode();
   System.out.println("This is a general Model");
  }
  
  default void stop(){
    System.out.println("the car is stopped");
  }
  
}
class Car implements Vehicle{
   public void start(){
     
    System.out.println("The car has started again!");
  }
  public void stop(){
   System.out.println("the car is stopped");
  }
  
 

 }

public class InterfaceWithStaticAndDefaultMethods{
  public static void main(String[] args){
   Car obj=new Car();
   obj.start();
   obj.stop();
   
   Vehicle.displayType();
   }
}