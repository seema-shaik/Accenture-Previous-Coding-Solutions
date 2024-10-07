import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PanCard 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
        String number = scn.nextLine();
       
        if(number.length() == 10)
        {
            Pattern pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
            
            Matcher matcher = pattern.matcher(number);
            
            if(matcher.matches())
            {
               System.out.println("Valid PAN no"); 
            }
            else
            {
                System.out.println("Invalid PAN no");
            }
            
        }
        else
        {
            System.out.println("Invalid PAN no");
        }

    }
}
