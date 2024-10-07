import java.util.*;
public class InsertEle 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n+1];
       for(int i = 0; i < n;i++)
       {
        arr[i] =  sc.nextInt();
       }
       int pos = sc.nextInt();
       int ele = sc.nextInt();
       for(int i = n; i >= pos;i--)
       {
            arr[i] = arr[i-1];
       }
       arr[pos-1] = ele;
       n++;
       for(int i  =0;i < n;i++)
       {
        System.out.print(arr[i]+" ");
       }
    }
}
