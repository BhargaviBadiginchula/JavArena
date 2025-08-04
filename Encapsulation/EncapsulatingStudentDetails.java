class Student{
  private String name;
  private int age;
  public void setName(String n){
   this.name=n;
  }
  public void setAge(int n,Student s){
  Student CurrentObj=s;   //Backend functionality of this keyword
  CurrentObj.age=n;
  }
 public void getName(){
   System.out.println(name);
 }
public void getAge(){
   System.out.println(age);
 }
}
  
class EncapsulatingStudentDetails{

  public static void main(String[] args){
    Student obj=new Student();
    obj.setName("Bhargavi");
    obj.getName();
    obj.setAge(21,obj);
    obj.getAge();
  }
}
