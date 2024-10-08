import java.util.*;
public class StringDecoder 
{
    static String Decoder(String s){
        if (s.length() == 0 || s.charAt(0) == '0') {
            return ""; 
        }
        
        String ans = "";
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                count++;
            }
            else{
                ans += (char)('A' + count - 1);
                count = 0;
            }
        }
        ans += (char)('A' + count - 1);
        return ans;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        String str = sc.nextLine();
        System.out.println(Decoder(str));
    }
}
