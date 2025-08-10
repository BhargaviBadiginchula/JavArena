package userDefinedPackage;
public class PublicScope {
    public String name;
    public static int age;
    public void publicMethod(){
        System.out.println("It is a Public Method");
    }
    public PublicScope(String n,int b){
        this.name=n;
        PublicScope.age=b;
    }
    public PublicScope(){
        this.name="Arun";
        PublicScope.age=25;
    }
    public static void main(String[] args){
        PublicScope ps=new PublicScope("Aditya",21);
        ps.publicMethod();
        System.out.println(ps.name);
        System.out.println(PublicScope.age);
    }
}