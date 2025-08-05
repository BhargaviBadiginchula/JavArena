enum TrafficSignals{
  RED,YELLOW,GREEN
  }
public class Enumeration{
  public static void main(String[] args){
    TrafficSignals signal=TrafficSignals.RED;
    switch(signal){
     case RED:
        System.out.println("stop!");
        break;
      case YELLOW:
         System.out.println("Wait");
        break;
      case GREEN:
         System.out.println("Wait");
        break;
      default:
         System.out.println("enter a valid value");
      }
  }
}