import java.util.*;
class Test_18{
    static void main(){
        System.out.print("Enter the last term: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p, sum = 0;
        for(int i = 1; i <= n; i++){
            p = (int)Math.pow(i, i);
            if(i % 2 == 0)
            sum = sum - p;
            else
            sum = sum + p;
        }
        System.out.println("SUM = " + sum);
    }
}