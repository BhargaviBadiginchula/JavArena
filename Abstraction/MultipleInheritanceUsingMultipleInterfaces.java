interface Printable{
  void print();

}

interface Scannable{
  void scan();
}

class Functionable implements Printable,Scannable{  //Multiple Inheritance
  public void print(){
    System.out.println("printing");
  }
  
 public void scan(){
  System.out.println("Scanning");
 }
}

class Report extends Functionable{   //Hybrid Inheritance
    public void print(){
    System.out.println("Done printing");
  }
}


public class MultipleInheritanceUsingMultipleInterfaces{
  public static void main(String[] args){
    Functionable obj=new Functionable();
    Report v=new Report();
    v.print();
    obj.print();
    obj.scan();
    }
}