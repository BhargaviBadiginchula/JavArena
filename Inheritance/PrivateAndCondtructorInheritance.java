class Parent{
  private int secretKey=2003;
  public void show()
  {
    System.out.println("Private Key "+secretKey);
  }
  Parent(){
    System.out.println("Inheriting parent constructor from child");
  }
}

class Child extends Parent {
  public void display(){
   //System.out.println(secretKey); ois not possible but we can access by calling public method having private property or Behavior
   super.show();
  }
  Child(){
   super();
  }
}

public class PrivateAndCondtructorInheritance{
  public static void main(String[] args){
    Child v=new Child();
    v.display();
  }
}
