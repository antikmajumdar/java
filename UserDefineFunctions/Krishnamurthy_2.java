import java.util.*;
class Krishnamurthy_2{
    static int fact(int k){
        int f = 1;
        while(k != 0){
            f *= k;
            k--;
        }
        return f;
    }
    static boolean check(int num){
        int x = num;
        int sum = 0;
        while(x != 0){
            sum += fact(x % 10);
            x = x / 10;
        }
        if(sum == num)
        return true;
        else
        return false;
    }
    static void main(){
        System.out.print("Enter a number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(check(num))
        System.out.println("It is a Krishnamurthy Number");
        else
        System.out.println("It is not a Krishnamurthy Number");
    }
}