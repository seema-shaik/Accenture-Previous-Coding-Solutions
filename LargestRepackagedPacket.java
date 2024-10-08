import java.util.*;
public class LargestRepackagedPacket 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] packets = new long[n];
        for (int i = 0; i < n; i++) {
            packets[i] = scanner.nextLong();
        }
        
        long carry = 0;
        long maxPacketSize = 0;
        for (int i = 0; i < n; i++) {
            carry += packets[i];
            long largestPowerOfTwo = 1;
            while (largestPowerOfTwo <= carry) {
                largestPowerOfTwo <<= 1; 
            }
            largestPowerOfTwo >>= 1; 
            if (largestPowerOfTwo > maxPacketSize) {
                maxPacketSize = largestPowerOfTwo;
            }
            carry -= largestPowerOfTwo;
        }
        
        System.out.println(maxPacketSize);
    }
}
