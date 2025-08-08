import java.util.*;
import java.time.*;
public class JavaBuiltInPackagesDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name =sc.nextLine();
		System.out.println(name);
		int arr[]= {343,65,78,345,987};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Date with Time "+dateTime);
		LocalDate date=LocalDate.now();
		System.out.println("Date of Today "+date);
		LocalTime time=LocalTime.now();
		System.out.println("Present Time "+time);
		
		//BuiltIn Math class from java.lang.Math;
		double ex=Math.pow(4, 3);
		System.out.println((long)ex);
		double randomVal=Math.random()*50;
		System.out.println(randomVal);
	}

}
