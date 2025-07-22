public class Variables {
    static String university;//Class Variable
    int number;  //Instance variable  //declaration
    public void call(String name){ //parameter variable
        System.out.println("please call "+name);
    }
    public static void main(String[] args){
        String name;//
        name="tarak";//assignment
        Variables instance=new Variables();
        name ="ram";//Reassignment
        instance.call("Kshatriya");
        System.out.println(university+" "+instance.number+" "+name);

    }
    
}
