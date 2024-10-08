import java.util.*;
public class MinSetBit 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int cnt = 0;
       while(num > 0)
       {
        cnt += num&1;
        num = num>>1;
       }
       int res = (int)Math.pow(2,cnt)-1;
       System.out.println(res);
    }
}
