import java.util.*;
public class BinaryForm 
{
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int bin[] = new int[32];
       int cnt = 0;
       while(num > 0)
       {
            bin[cnt] = num%2;
            num = num/2;
            cnt++;
       }
       int sum = 0;   
       for(int i = cnt-1;i >= 0;i--)
       {
        sum = sum+bin[i];
       }
       System.out.println(sum);
    }
}
