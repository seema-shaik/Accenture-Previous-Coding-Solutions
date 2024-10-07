import java.util.*;
public class InsertionSort 
{
    static void Insert(int array[],int n)
    {
        for (int step = 1; step < n; step++) {
            int key = array[step];
            int j = step - 1;
            while (j >= 0 && key < array[j]) {
              array[j + 1] = array[j];
              --j;
            }
            array[j + 1] = key;
          }
        for(int i  =0; i < n;i++)
        {
            System.out.print(array[i]+" ");
        }
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
       Insert(arr,n);
    }
}
