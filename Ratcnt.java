import java.util.*;
public class Ratcnt 
{
    public static int Calculate(int r,int unit,int size,int arr[])
    {
        if(size == 0)
            return -1;
        int fr = r*unit;
        int ftn = 0,hcnt = 0;
        for(int i = 0; i < size;i++)
        {
            ftn += arr[i];
            hcnt++;
            if(ftn >= fr)
            {
                break;
            }
        }
        if(ftn < fr)
            return 0;
        return hcnt;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(Calculate(r,unit,size,arr));
    }
}
