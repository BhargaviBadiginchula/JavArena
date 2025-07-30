class Parent{
    public void perform(int a,int b){
        System.out.println("multiplication of  a and  b:- "+(a*b));
    }
}


class Child1 extends Parent{
    @Override //metadata used to provide information about the code like here method is overriding meaning same method sgnature has been used in somewhere.Using @ovverride compiler make sure that the both the methods are having same signature never mistake for new methods.
    public void perform(int a,int b){

      System.out.println("calling using child1 class:");
      super.perform(a,b);  //calling parent method form child1
      if(a>b){
        System.out.println("a is greater");
      }
      else{
        System.out.println("B is greater");
      }
    }
}

class Child2 extends Parent{
     @Override
     
    public void perform(int a,int b){
        
        System.out.println("calling using child2 class:");
        super.perform(a,b); //calling parent method form child2.
        
        if(a%b==0){
            System.out.println("a is divisible by b");

        }
        else{
            System.out.println("a is not divisible by b");
        }
    }
   
}


public class HeirarchicallRunTimePlymorphism {
      public static void main(String[] args){
        Child1 c=new Child1();
        c.perform(15,5);//calling using child1 class
        Child2 v=new Child2();
        v.perform(12,6);//calling using child2 class
    } 
    
}
