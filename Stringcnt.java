/*examination
 * e9n
 */
import java.util.*;
public class Stringcnt 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int cnt = 0;
        int len = st.length();
        for(int i = 1;i < len-1;i++)
        {
            cnt++;
        }
        String res = st.charAt(0) + Integer.toString(cnt) + st.charAt(len - 1);
        System.out.print(res);
    }    
}
