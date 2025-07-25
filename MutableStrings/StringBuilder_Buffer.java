public class StringBuilder_Buffer{  
  public static void main(String[] args){
    StringBuilder sb=new StringBuilder("Badiginchula");
    System.out.println(sb);
    sb.append("Bhargavi");
    System.out.println("After appending :- "+sb);
    sb.insert(0,"ThogataveeraKshatriya");
    System.out.println("after insertion :- "+sb);
    sb.replace(0,21,"");
    System.out.println("after replace :-" +sb);
    sb.delete(0,12);
    System.out.println("after delete:- "+sb);
    System.out.println("using char at()"+sb.charAt(5));
    System.out.println("using substring with single index"+sb.substring(5));
    System.out.println("using substring start and end indices:- "+sb.substring(2,6));
    System.out.println("length:- "+sb.length());
    System.out.println("capcacity;-"+sb.capacity());
    sb.ensureCapacity(100);
    System.out.println("setting capacity:- "+sb.capacity());
    
    sb.deleteCharAt(2);
    System.out.println("after deleting the character at index 2 :- "+sb);
    sb.setCharAt(2,'o');
    System.out.println("setting char at 2:- "+sb);  
    sb.reverse();
    System.out.println("after reverse:- "+sb);
    StringBuffer strBuffer=new StringBuffer("Bhanu Venkata Prasad");
    
    System.out.println("finding first index of 'n' in String :- "+strBuffer.indexOf("n"));
    System.out.println("finding last index of 'n' in String :- "+strBuffer.lastIndexOf("n"));

    strBuffer.trimToSize();                          //it will trim the string inot its exact capacity

    System.out.println("special methhod only in buffer :- "+strBuffer.capacity());
    System.out.println("finally converting into String:-"+sb.toString());

   //All String Buffer and StringBuilder same .they possess same behaviour and names.
}
}