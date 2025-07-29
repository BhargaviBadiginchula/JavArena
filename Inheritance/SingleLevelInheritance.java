class Parent{
   int a=10;
   String name="bhargavi";
   public void show(){
      System.out.println("Parent class"+"\nvalue of a:- "+a);
   }
}

class Child extends Parent{ //extends keyword is used to acquire properties and behaviuor from parent class
  public void display(){
     System.out.println("Child Class"+"\nname :- "+name);
  }
}

public class SingleLevelInheritance{
  public static void main(String []args){
    Child obj=new Child();
    obj.show();
    obj.display(); 
  }
}
   