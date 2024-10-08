import java.util.*;
public class MagicalNumbersCounter 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int magicalCount = 0; 
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            int number = i;

            while (number > 0) {
                if ((number & 1) == 1) {
                    sum += 2; 
                } else {
                    sum += 1; 
                }
                number >>= 1; 
            }
            
            if (sum % 2 != 0) {
                magicalCount++; 
            }
        }
        
        System.out.println(magicalCount);
    }
}
