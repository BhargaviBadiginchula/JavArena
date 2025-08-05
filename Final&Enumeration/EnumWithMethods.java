enum Season{
   SUMMER("Hot"),WINTER("Cold"),RAINY("Wet");
   private final String description;
   Season(String desc){
     this.description=desc;
   }
   public String getDescription(){
     return description;
   }
}
 
class EnumWithMethods{
   public static void main(String []args){
     System.out.println("Seasons and their Description");
     for(Season s:Season.values()){
        System.out.println(s+" :- "+s.getDescription());
     }
  }
}
