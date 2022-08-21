import java.util.Arrays;
import java.util.Scanner;
public class StrAnagram {
    public static void Anagram(String str1 , String str2 )
    {
        if (str1.length()!=str2.length())
        {
            System.out.println("not Anagram");

        }
        char []arr = str1.toCharArray();
        Arrays.sort(arr);

        str1 = new String(arr);
        char []arr1 = str2.toCharArray();
        Arrays.sort(arr1);
        str2 = new String(arr1);
        System.out.println(str1.equals(str2)); // Returns true because they are equal
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String");
        String str1 = sc.nextLine();
        System.out.println("Enter string");
        String str2 = sc.nextLine();
        // russian
        
    }
    
}
