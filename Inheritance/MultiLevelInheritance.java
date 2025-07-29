class GrandParent{
  int a=10;int b=20;
  GrandParent(){
    System.out.println("Hello this is Constructor");
   }
  public void add(){
    System.out.println("Addition of a and b performed in Grand Parent/Root Class is " +(a+b));
  }
}

class Parent extends GrandParent {
 
   
  public void subtract(){
    System.out.println("Subtraction of a and b performed in  Parent Class is "+(a-b));
  }
}

class Child extends Parent {

   
  public void multiply(){
    System.out.println("Multiplication of a and b performed in child Class is "+a*b);
  }
}
 

public class MultiLevelInheritance{
   public static void main(String[] args){
    Child obj=new Child();
    obj.multiply();
    obj.subtract();
    obj.add();
   }
}