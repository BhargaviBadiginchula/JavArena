public class ToggleCase{


  public static void toggle(String s){
    char[] ch=s.toCharArray();
    char []res=new char[ch.length];
    for(int i=0;i<ch.length;i++){
      if(Character.isLowerCase(ch[i])){
       
           res[i]=Character.toUpperCase(ch[i]);
       }
       if(Character.isUpperCase(ch[i])){
          
        res[i]=Character.toLowerCase(ch[i]);
       }

      }System.out.println("Toggled case:- "+new String(res ));
       System.out.println("Original String:- "+s);    }
     
  public static void main(String[] args){
    toggle("BhaRgaVi");
   } 

}