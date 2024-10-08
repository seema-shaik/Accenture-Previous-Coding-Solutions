import java.util.*;
public class SumOfFactorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>fact = new ArrayList<>();
        for(int i = 0;i < n;i++)
        {
            int f = 1;
            int ele = sc.nextInt();
            if(ele >= 0 && ele <= 9)
            {
                for(int j = 1; j <= ele;j++)
                {
                    f = f*j;
                }
                fact.add(f);
            }
        }
        int arraysize = fact.size();
        
        if(arraysize>0)
        {
            int sum = 0;
            for(int i = 0; i<arraysize ; i++)
            {
                sum += fact.get(i);
            }
            
            System.out.println(sum);
        }
        else
        {
            System.out.println("No positive and single digit numbers found in an array");
        }

    }
}
