/*final abstract V{
   public abstract void add(); cannot be final an abstract classs must be extended */

final class A{

  final int pass=2424;
  public void greet(){
    System.out.println("hello");
  }
 }
/*class B extends A{
   public void greet(){
    System.out.println("Good Afternoon");
  }
 } Inheritance is not allowed for final Classes"*/
public class FinalClasses{
  public static void main(String[] args){
    A v=new A();
    v.greet();
    System.out.println(v.pass);
  }
}