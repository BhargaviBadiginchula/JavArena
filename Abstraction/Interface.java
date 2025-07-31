interface Vehicle{
   void start(boolean isStart);
   void stop();
}
 
class Car implements Vehicle{
  public void start(boolean isStart){
    if(isStart){
      System.out.println("The car is Started");
    }
  }
  
  public void stop(){
    System.out.println("The car is Stopped");
  }
}

public class Interface{
  public static void main(String[] args){
    Car v=new Car();
    v.start(true);
    v.stop();
  }
}
