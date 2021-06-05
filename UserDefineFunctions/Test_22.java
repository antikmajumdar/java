import java.util.*;
class Test_22{
    static void main(){
        System.out.print("Enter the last term: ");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double sum = 0;
        int n, d;
        System.out.println();
        for(int i = 0, j = 1; j <= t; i++, j++){
            n = i + i + 1;
            d = (i + 1) * (i + 2);
            sum = sum + (double) n / d;
            System.out.println(n+"/"+d+"="+sum);
        }
        System.out.println("Sum = " + sum);
    }
}