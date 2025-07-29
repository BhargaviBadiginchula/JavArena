class Parent{
  int a=5;int b=3;
  Parent(){
    System.out.println("Hello this is Constructor");
   }
  public void power(){
    System.out.println("power of a and b performed in Root Class is " +Math.pow(a,b));
  }
}

class Child1 extends Parent {
 
   
  public void division(){
    System.out.println("Division of a and b performed in Child1 Class is "+(a/b));
  }
}

class Child2 extends Parent {

   
  public void multiply(){
    System.out.println("Multiplication of a and b performed in child2 Class is "+a*b);
  }
}
 
public class HeirarchicalInheritance{
  public static void main(String[] args){
    Child1 u=new Child1();
    u.power();
    u.division();
  
   Child2 v=new Child2();
   v.power();
   v.multiply();
   }
}
