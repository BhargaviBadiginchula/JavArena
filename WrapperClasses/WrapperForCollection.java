
import java.util.ArrayList;
public class WrapperForCollection {
    public static void main(String[] args){
      ArrayList<Integer> al=new ArrayList<>();
      al.add(2);
      al.add(3);
      al.add(0,2);
      int d=1234;
      al.add(d);//Auto Boxing
     // ArrayList<int> a=new ArrayList<>(); doesnit support
     System.out.println(al);
    }
}
