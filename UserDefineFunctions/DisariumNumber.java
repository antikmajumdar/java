import java.util.*;
class DisariumNumber{
    static void main(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = num, sum = 0, d = 0;
        String s = Integer.toString(num);
        int length = s.length();
        while(n > 0){
            d = n % 10;
            sum = sum + (int)Math.pow(d, length);
            length--;
            n = n / 10;
        }
        if(sum == num)
        System.out.println("It is a Disarium Number.");
        else
        System.out.println("It is not a Disarium Number.");
    }
}