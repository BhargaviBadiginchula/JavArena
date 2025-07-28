import java.util.Arrays;
public class CharCountOccurence{
  public static void countOccurence(){
    String s=new String("bhargavibadiginchula");
    char []ch=s.toCharArray();
    Arrays.sort(ch);
    int count=1;
    for(int i=0;i<ch.length-1;i++){
      if(ch[i]==ch[i+1]){
         count++;
      }else{
       System.out.println(ch[i]+" "+count);
       count =1;}
   }
  System.out.println(ch[ch.length-1]+" "+count+"\n given string "+Arrays.toString(ch));

}
public static void main(String[] args){
   countOccurence();
}
}