package userDefinedPackage;
// import userDefinedPackage.*;
class PublicChild extends PublicScope{
    PublicChild(){
        // super();
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



//default scope
class DefChild extends DefaultScope{
    DefChild(){
        super("Tarak",40);
    }
}

//Protected Scope

class ProtectChild extends ProtectedScope{
    ProtectChild(){

        super("Vaishali",20);
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println("Public Access Modifier Scope");
        System.out.println("=".repeat(50));
        String []ar={};
        PublicScope.main(ar);
        PublicChild pp=new PublicChild();
        System.out.println("Accessing From Subcalss");
        System.out.println(pp.name);//
        System.out.println(PublicChild.age);//From subclass

        System.out.println();
        System.out.println("Private Access Modifier Scope");
        System.out.println("=".repeat(50));
        PrivateScope.setPin(0330);
        PrivateScope.getPin();
        PrivateScope ps=PrivateScope.createInstance("CyperText");
        ps.setCode("Encrypted");
        ps.getCode();
        ps.pvtCall();
        //ps.privateMethod(); not beccause private canno be accessed 

        System.out.println("Accessing by calling main()");
        ProtectedScope.main(ar);
        //subclass cannot extend private constructor so it is not possible accessin private method members here 
        PrivateChild pcc=new PrivateChild();
        pcc.show();//from subclass  method call
        pcc.setSecretKey("Emergency");
        pcc.getSecretKey();//using subclass object reference



        System.out.println();
        System.out.println("Default Access Modifier Scope");
        System.out.println("=".repeat(50));
        System.out.println("Accessing from sub class in the same package");
        DefChild deff=new DefChild();
        deff.defMethod();
        DefChild.statdefMethod();
        System.out.println(deff.defName);
        System.out.println(DefChild.defAge);
        System.out.println();
        System.out.println("Accessing by calling main method in the same class");
        DefaultScope.main(ar);

        System.out.println();
        System.out.println("Protected Access Modifier Scope");
        System.out.println("=".repeat(50));
        System.out.println("Accessing from sub class in the same package");

        ProtectedScope pds=new ProtectedScope("Keerthana",21);
        pds.ProtectedMethod();
        ProtectedScope.statProtectMethod();
        System.out.println(pds.ProtAge);
        System.out.println(ProtectedScope.ProtName);

        System.out.println("Accessing by calling main Method");
        ProtectedScope.main(ar);

        System.out.println("Accessing from Sub class");
        ProtectChild pc=new ProtectChild();
        pc.ProtectedMethod();
        System.out.println(pc.ProtAge);

    }

}
