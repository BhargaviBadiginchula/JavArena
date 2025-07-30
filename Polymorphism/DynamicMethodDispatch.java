class Parent{
    int a=10;int b=20;
    public  void Animal(String name){
       System.out.println(name+" is an animal");
    }
/*     public void  static add(){ 
       System.out.println(a+b);

 } */
  //static methods and variables are belongs to class they do not connect with objects.So we can say static varaibles and methods are non polymorphic
}
class Child extends Parent{
    int x=19;
    public void Animal(String name){
       System.out.println(name+" is an animal");
    }

     /* public void  static add(){
       System.out.println(a+b);

 }  */ 
}
public class DynamicMethodDispatch {
    public static void main(String[] args){
    Parent c=new Child();
    c.Animal("Dog");//calls child method
    System.out.println(c.a);//prints a=10;
    // System.out.println(c.x); is not possiible 

}
}