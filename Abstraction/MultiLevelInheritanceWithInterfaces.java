interface Parent{
   void property();
   
}
interface Child extends Parent{
   void assests();
}
 
interface GrandChild extends Child{  //Multilevel Inheritance
  void debt();
}
class Heir implements GrandChild{
  public void property(){
   System.out.println("Heir acquired the property");
  }
 public void assests(){
   System.out.println("Heir take the ownership of all assests");
 }
public void debt(){
  System.out.println("Heir cleared all the debt");
}
}

public class MultiLevelInheritanceWithInterfaces{
  public static void main(String[] args){
   Heir obj=new Heir();
   obj.property();
   obj.assests();
   obj.debt();
  }
}
  