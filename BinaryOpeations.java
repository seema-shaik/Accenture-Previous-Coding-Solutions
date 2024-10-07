import java.util.*;
public class BinaryOpeations 
{
   public static int CalculateBinaryOperations(String st)
   {
     int len = st.length();
     int res = st.charAt(0)-'0';
     for(int i = 1; i < len;)
     {
        char prev = st.charAt(i);
        i++;
        if(prev == 'A')
            res = res&(st.charAt(i)-'0');
        else if(prev == 'B')
            res = res | (st.charAt(i)-'0');
        else
            res = res ^ (st.charAt(i) - '0');
        i++;
     }
     return res;
   }
   public static void main(String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      String st = sc.nextLine();
      System.out.println(CalculateBinaryOperations(st));
   }   
}
