import java.util.*;
public class MagicalNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int magicalCount = 0; 
        for (int i = 1; i <= N; i++) {
            String binaryString = Integer.toBinaryString(i);
            StringBuilder modifiedBinary = new StringBuilder();
            for (char ch : binaryString.toCharArray()) {
                if (ch == '0') {
                    modifiedBinary.append('1'); 
                } else {
                    modifiedBinary.append('2'); 
                }
            }
            int sum = 0;
            for (char ch : modifiedBinary.toString().toCharArray()) {
                sum += Character.getNumericValue(ch); 
            }
            
            if (sum % 2 != 0) {
                magicalCount++; 
            }
        }
        System.out.println(magicalCount);
        
    }
}
