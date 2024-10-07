import java.util.*;
public class OperationChoice 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(c == 1)
        {
            System.out.println(a+b);
        }
        else if(c == 2)
        {
            System.out.println(a-b);
        }
        else if(c == 3)
        {
            System.out.println(a*b);
        }
        else
        {
            System.out.println(a/b);
        }
    }
}
