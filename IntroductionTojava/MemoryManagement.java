public class MemoryManagement {
    static String nationality="indian";
    int number=10;

    public void add(int a,int b){
        int result=a+b;
        System.out.println("sum : "+result);
    }
    public static void main(String[] args){
        MemoryManagement mem=new MemoryManagement();
        mem.add(15,5);
    }
}


/* Memory Allocation
 * 
 * Heap Area=sc(object),instance variable(number)
 * 
 * stack Area =method calls(.add()) ,local variables ex:a,b,result as stack memory ;
 * 
 * Method Area =static variables(nationality) ,method definition(add,main)
 * 
 */