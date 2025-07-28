public class WhiteSpaces{
  public static void main(String[] args){
    String st="Every Student has potential to code";
    String s[]=st.split(" ");
    StringBuffer str=new StringBuffer();
    for(String a:s)
     {
       str.append(a);
    }
  System.out.println(str);
 }
}