import java.util.*;
class KeithNumber{
    static void main(){
        int i, sum;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        String s = Integer.toString(n);
        int a[] = new int[s.length()];
        for(i = 0; i < s.length(); i++){
            a[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        
        do {
            sum = 0;
            for(i = 0; i < a.length; i++){
                sum = sum + a[i];
            }
            for(i = 0; i < a.length-1; i++) {
                a[i] = a[i+1];
            }
            a[i] = sum;
        }while(sum < n);
        
        if (sum == n) {
            System.out.println("This is a Keith Number");
        } else {
            System.out.println("This is not a Keith Number");
        }
    }
}