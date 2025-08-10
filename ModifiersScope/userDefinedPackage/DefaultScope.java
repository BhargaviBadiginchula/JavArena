package userDefinedPackage;

class DefaultScope {
    String defName;
    static int defAge;
    void defMethod(){
        System.out.println("im an default method");
    }
    DefaultScope(String a,int b){
        this.defName=a;
        DefaultScope.defAge=b;
    }
    static void statdefMethod(){
        System.out.println("im a default static method");

    }
    public static void main(String[] args){
        DefaultScope df=new DefaultScope("Anirudh", 30);
        System.out.println(df.defName);
        System.out.println(DefaultScope.defAge);
        df.defMethod();
        DefaultScope.statdefMethod();
    }
}
