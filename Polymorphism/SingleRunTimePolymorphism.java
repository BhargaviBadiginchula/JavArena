class Parent{
    public void perform(int a,int b){
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
        super.perform(10,12);
        if(a%b==0){
            System.out.println("a is divisible by b");

        }
        else{
            System.out.println("a is not divisible by b");
        }
    }
   
}

public class SingleRunTimePolymorphism {  
    public static void main(String[] args){
        Child c=new Child();
        c.perform(15,5);
       
    }  

}
