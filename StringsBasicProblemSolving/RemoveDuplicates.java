import java.util.Arrays;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Bhargavi Thogataveera Kshatriya";
        str = str.toLowerCase().replaceAll(" ", ""); // remove spaces & lowercase
        char[] ch = str.toCharArray();
        Arrays.sort(ch); // sort to group duplicates

        String result = "";
        for (int i = 0; i < ch.length; i++) {
            // Only add if character not already in result
            if (result.indexOf(ch[i]) == -1) {
                result += ch[i]+" ";
            }
        }

        System.out.println("Non-duplicate characters are: " + result);
    }
}
    
     
