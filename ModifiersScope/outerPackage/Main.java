package outerPackage;
import userDefinedPackage.*;

class OuterChild extends PublicScope{
    OuterChild(String n){
        super.name=n;
        
    }
}

class PrivateChild extends PrivateWithoutConstructor{
    public void show(){
        super.setSecretKey("Agent");
        super.getSecretKey();
    }
}
// class PrivateParent extends PrivateScope{
   
//     public static PrivateScope Show(){
//         return PrivateScope.createInstance("PrivateParentSecret");
//     }
//      PrivateParent(String n){
//     }
// }

//is not possible because it has private Constructor A sub class should be invokes superclass() which is not possible 


//a default class cannot be accessed in another package;


//Protected  Scope
class ProtectChild extends ProtectedScope{
    ProtectChild(){
        super("Shahin",23);
        
    }
    public void show(){
        super.ProtectedMethod();
        ProtectedMethod();
        System.out.println(super.ProtAge);
        System.out.println(ProtectedScope.ProtName);
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println("Public Access Modifier Scope");
        System.out.println("=".repeat(50));
        String []ar={};
        PublicScope.main(ar);
        OuterChild pp=new OuterChild("Nani");
        System.out.println("Accessing From Subcalss");
        System.out.println(pp.name);//
        System.out.println(OuterChild.age);//From subclass

        System.out.println();
        System.out.println("Private Access Modifier Scope");
        System.out.println("=".repeat(50));

        

        PrivateScope pvt=PrivateScope.createInstance("confidential");//Factory method call
        pvt.setCode("pen paper pen");
        PrivateScope.setPin(2424);
        System.out.println(PrivateScope.getPin());
        // System.out.println(pvt.code);only possible in thse same class

        // pvt.privateMethod();
        // PrivateScope pV=new PrivateScope("sand");Constructor is private scoped
        pvt.pvtCall();
        
        pvt.setCode("Private_Key");
        pvt.getCode();
        System.out.println("Accessing using Calling main method from PrivateScope");
        // By calling the main method of PrivateScope, we can access all members 
        // since they are accessible within the same class.
        PrivateScope.main(ar); 
        
        PrivateScope.setPin(0330);
        PrivateScope.getPin();
        PrivateScope ps=PrivateScope.createInstance("CyperText");
        ps.setCode("Encrypted");
        ps.getCode();
        ps.pvtCall();
        // System.out.println(ps.msg);

        System.out.println();
        System.out.println("Protected Access Modifier Scope");
        System.out.println("=".repeat(50));
        System.out.println("Accessing from sub class in the same package");

        // ProtectedScope pds=new ProtectedScope("Keerthana",21);
        // pds.ProtectedMethod();
        // ProtectedScope.statProtectMethod();
        // System.out.println(pds.ProtAge);
        // System.out.println(ProtectedScope.ProtName);
        //is not possible can be possible by sub class 

        System.out.println("Accessing by calling main Method");
        ProtectedScope.main(ar);

        System.out.println("Accessing from Sub class");
        ProtectChild pc=new ProtectChild();
        // pc.ProtectedMethod();
        // System.out.println(pc.ProtAge);
        pc.show();
    }
}
