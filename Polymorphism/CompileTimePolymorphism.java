public class CompileTimePolymorphism{
    public void add(){
        int a=15;int b=10;
        System.out.println("sum:- "+(a+b));
    }

    public void add(int a,int b){
        
        System.out.println("add:- "+(a+b));
    }
    

    public void add(int a ,int b,int c){
       
        System.out.println("sum:- "+(a+b+c));//Method overloading based on different number of parameters
    }

    public void add(int a,String b){
        
        System.out.println("concate:- "+a+b);//Method Overloading using different datatype of params 
    }

    public void add(String a,int b){
       
        System.out.println("concate:- "+a+b);//method overloading using differnce in order of parameters
    }

    public static void main(String[] args){
        CompileTimePolymorphism v=new CompileTimePolymorphism();
        v.add();//calling no params method
        v.add(10,20);//calling pameterized method with two int params
        v.add(10,15,5);//calling parameterized method with 3 params
        v.add(10,"bhanu");//calling method with different type of params
        v.add("bhanu",21);//calling method wiht different order of params

    }

}
