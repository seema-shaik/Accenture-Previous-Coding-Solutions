import java.util.*;
public class PasswordCheck 
{
    public static int CheckPassword(String pass)
    {
        int len = pass.length();
        int numst =0,iscap = 0;
        if(len < 4)
            return 0;
        else
        {
            if(pass.charAt(0) >= '0' && pass.charAt(0) <= '9')
                return 0;
            for(int i =0; i < len;i++)
            {
                if(pass.charAt(i) == ' '|| pass.charAt(i) == '/')
                {
                    return 0;
                }
                else if(pass.charAt(i)>= '0' && pass.charAt(i) <= '9')
                {
                    numst = 1;
                }
                else if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')
                {
                    iscap++;
                }
            }
            iscap = (iscap == 1)?1:0;
            if(iscap == 1 && numst == 1)
                return 1;
            else
                return 0;
        }
        
        
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        System.out.println(CheckPassword(pass));
    }
    
}
