class GrandParent{
    public void perform(int a,int b){
        System.out.println("multiplication of  a and  b:- "+(a*b));
    }
}


class Parent extends GrandParent{
    public void perform(int a,int b){
      super.perform(a,b);
      if(a>b){
        System.out.println("a is greater");
      }
      else{
        System.out.println("B is greater");
      }
    }
}

class Child extends Parent{

     
    public void perform(int a,int b){
        super.perform(a,b);
        if(a%b==0){
            System.out.println("a is divisible by b");

        }
        else{
            System.out.println("a is not divisible by b");
        }
    }
   
}


public class MultiLevelRunTimePlymorphism {
     public static void main(String[] args){
        Child c=new Child();
        c.perform(15,5);
       
    } 
}
