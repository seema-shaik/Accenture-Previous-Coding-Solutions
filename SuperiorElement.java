import java.util.*;
import java.lang.*;
public class SuperiorElement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] numbers = s.split(" ");
        int n = numbers.length;
        int arr[] = new int[n];
        for(int i = 0; i < n;i++)
        {
            arr[i] = Integer.parseInt(numbers[i]);
        }
        int sup = Integer.MIN_VALUE,cnt = 0;
        for(int i = n-1;i >= 0;i--)
        {
            if(arr[i] > sup)
            {
                cnt++;
                sup = arr[i];
            }
        }
        System.out.println(cnt);
    }
}
