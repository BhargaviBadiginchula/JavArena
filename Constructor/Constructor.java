public class Constructor{
  int num;
  String  name;
   char ch;
   float f;
  boolean bool; 
  public void show(){
    System.out.println("int "+num+" String "+name+" char "+ch+" float "+f+" boolean "+bool);
}
  //defaul constructor
 Constructor(){
     System.out.println("default contructor");
}

//Parameterized constructor
  Constructor(int a,String b){
   name=b;
   num=a;
}


//Constructor Overloading
  
  Constructor(String a,int b){
    name=a;
    num=b;
   
  }


  public static void main(String[] args){
    Constructor p=new Constructor(10,"bhanu");
    Constructor df=new Constructor();
    Constructor o=new Constructor("bhargavi",20);
    o.show();
   p.show();
 }
}