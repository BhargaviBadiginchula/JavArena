class Student {
  String name = "Bhargavi";
  final String name1;

  Student(String n) {
    this.name1 = n;
  }
}

public class FinalVar {
  final static double PI = Math.PI;

  public static void main(String[] args) {
    final int age = 24;
    // age=25;cannot be reassigned;
    // name1="Venkat";cannot be reassigned for a final static variable.
    final Student v = new Student("Farhan");

    // PI=2.34 not possible cannot be reassinged;
    // v=new Student(); not possible final object refrence cannot be reassigned with
    // new object.
    System.out.println(v.name + "\n" + v.name1+"\n"+age);
  }
}