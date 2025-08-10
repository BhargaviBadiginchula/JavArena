package userDefinedPackage;

public class ProtectedScope {
    protected static String ProtName;
    protected int ProtAge;
    protected void ProtectedMethod(){
        System.out.println("This is from Protected Method");
    }
    protected static void statProtectMethod(){
        System.out.println("This is from Protected Static Method");
    }
    protected ProtectedScope(String n,int a){
        this.ProtAge=a;
        ProtectedScope.ProtName=n;;
    }

    public static void main(String[] args){
        ProtectedScope prt=new ProtectedScope("Ashwatthama",2000);
        prt.ProtectedMethod();
        ProtectedScope.statProtectMethod();
        System.out.println(ProtectedScope.ProtName);
        System.out.println(prt.ProtAge);
    }
}
