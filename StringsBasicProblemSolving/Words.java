public class Words{
  public static void main(String[] args){
    String s="This is time to work on Strings";
    String[] str=s.split(" ");

    int count=0;
   for(String a:str){
   
    count++;
    }
 System.out.println("the count of words in the string:- "+count);
   }
}