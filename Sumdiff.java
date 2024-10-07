import java.util.*;
public class Sumdiff 
{
    public static int differenceofSum(int n,int m)
    {
        int sum = 0,sum1 = 0;
        for(int i = 1;i <= m;i++)
        {
            if(i%n == 0)
                sum += i;
            else
                sum1 += i;
        }
        return Math.abs(sum - sum1);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.err.println(differenceofSum(n,m));
    }
}
