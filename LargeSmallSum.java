import java.util.*;
public class LargeSmallSum 
{
    public static int LargeSmallSum(int arr[],int n)
    {
        if(n <= 3)
            return 0;
            ArrayList < Integer > even = new ArrayList < Integer > ();
            ArrayList < Integer > odd = new ArrayList < Integer > ();
            even.add (arr[0]);
        
            for (int i = 1; i < arr.length; i++)
              {
            if (i % 2 == 0)
              even.add (arr[i]);
            else
              odd.add (arr[i]);
              }
            Collections.sort (even);
            Collections.sort (odd);
        
            return even.get (even.size () - 2) + odd.get (odd.size () - 2);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(LargeSmallSum(arr,n));
    }
}
