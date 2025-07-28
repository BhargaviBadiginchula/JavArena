public class StringOperations{
  static String rev="";static String str="";
  public static void main(String[] args){
    str="Bhargavi";
    //finding length without length()
    int count=0;
    char ch[]=str.toCharArray();
    for(char a:ch){
      count++;
    }
 System.out.println("Length odf the string:- "+count);



//reversing a string without reverse
  
  for(int i=str.length()-1;i>=0;i--){
     rev+=str.charAt(i);
  }
System.out.println("reversed string:- "+rev);
 
isPalindrome();
upperLowerConversion("TRessPasseRsS");
vowelConsonantCount("BhargaviBadiginchula");
}

  
  //3.checking whether string is a palindrome.
 public static void isPalindrome(){
      str="racecar";
      rev="";
      for(int i=str.length()-1;i>=0;i--){
        rev+=str.charAt(i);
      }
    System.out.println("reversed string:- "+rev);
   

     if (rev.equals(str)){
         System.out.println("is palindrome");
     } else{
       System.out.println("is  not a palindrome");

       }
   }




//Vowel and Cnsonant Count in a String
   public static void vowelConsonantCount(String name){
    char []ch=name.toCharArray();
    
    int vowelCount=0;int consonantCount=0;
      for(char c:ch){
      c=Character.toLowerCase(c);
      if(Character.isLetter(c)){
        if(c=='a' || c=='e' || c=='i' || c=='o'||c=='u'){
           vowelCount++;
        }else{
          consonantCount++;
        }
      }
     }System.out.println("Vowel count in String:- "+vowelCount+" in "+name);
      System.out.println("consonant count in String:- "+consonantCount+" in "+name);

}
     

  //converting into lower and uppercase without toLowercase() & toUppercase()

   public static void upperLowerConversion(String s){
     char ch[]=s.toCharArray();
     String lower="";String upper="";
     for(char a:ch){
       if(a>='a' && a<='z'){
          upper+=(char)(a-32);
        }
       if(a>='A'&& a<='Z'){
         lower+=(char)(a+32);
        }
}
      System.out.println("original  string:- "+s);
         

      System.out.println("lower case letters:- "+lower);
         
      
     System.out.println("uppercase:- "+upper);
}
}