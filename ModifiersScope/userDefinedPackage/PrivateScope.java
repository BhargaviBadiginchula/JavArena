package userDefinedPackage;

public class PrivateScope {
    private String code;
    private static int pin;
    private String msg;
    public void setCode(String code) {
        this.code = code;
    }
    public static void setPin(int pin) {
        PrivateScope.pin = pin;
    }
    public void getCode() {
        System.out.println(code);
    }
    public static int getPin() {
        return pin;
    }
    private PrivateScope(String m){
        this.msg=m;
    }

    //creating factory method for instantiation of private constructor
    public static PrivateScope createInstance(String name){
        return new PrivateScope(name);
    }

    private void privateMethod(){
        System.out.println("This is a private method");
    }
    public void pvtCall(){
        PrivateScope pvts=PrivateScope.createInstance("Secret_Message");//Factory method call
        pvts.setCode("Private");
        privateMethod();
        System.out.println(pvts.msg);

        // System.out.println(pvts.msg);
        
    }
    public static void main(String [] args){
        PrivateScope pvt=PrivateScope.createInstance("confidential");//Factory method call
        pvt.setCode("pen paper pen");
        PrivateScope.setPin(2424);
        System.out.println(PrivateScope.getPin());
        System.out.println(pvt.code);

        pvt.privateMethod();
        PrivateScope pV=new PrivateScope("sand");
        PrivateScope.createInstance("Tricky");
        pV.pvtCall();
        System.out.println(pV.code);
        pV.setCode("Private_Key");
        pV.getCode();
        

    }
}
