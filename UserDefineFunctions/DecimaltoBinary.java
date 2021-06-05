import java.util.*;
class DecimaltoBinary{
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q, r;
        String s = "";
        while(n > 0){
            q = n / 2;
            r = n % 2;
            n = q;
            s += Integer.toString(r);
        }
        StringBuffer sb = new StringBuffer(s);
        System.out.print(sb.reverse());
    }
}