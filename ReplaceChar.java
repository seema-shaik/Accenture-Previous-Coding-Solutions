import java.util.*;
public class ReplaceChar 
{
    public static String ReplaceCharacter(String st,char ch1,char ch2)
    {
        String res ="";
        for(int i = 0; i < st.length();i++)
        {
            if(st.charAt(i) == ch1)
            {
                res = res+ch2;
            }
            else if(st.charAt(i) == ch2)
            {
                res = res+ch1;
            }
            else
            {
                res = res+st.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);
        System.out.println(ReplaceCharacter(st,ch1,ch2));
    }
}
