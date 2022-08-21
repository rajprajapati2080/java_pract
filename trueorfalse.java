import java.util.Scanner;

public class trueorfalse {
    public static void ispal(String str)
    {
        int begin = 0;
        int end = str.length()-1;
        while(begin<end)
        {
        if(str.charAt(begin)!=str.charAt(end))
        {
            System.out.println("notpal");
        }
        begin++;
        end--;
    }
    System.out.println("ispal");
}
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AnyString : ");
        String str = sc.nextLine();
        ispal(str);
    }
    
}
