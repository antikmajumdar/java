import java.util.*;
class Test_13{
    static void SumSeries(int n, double x){
        double sum = 0.0;
        for(int i = 1; i <= n; i++){
            double d = x/i;
            System.out.println("Nth value: " + d);
            if(i % 2 == 0)
            sum = sum - d;
            else
            sum = sum + d;
        }
        System.out.println("The sum of the first series is: " + sum);
    }
    static void SumSeries(){
        long sum = 0;
        for(int i = 1; i <= 20; i++){
            long p = 1;
            for(int j = 1; j <= i; j++){
               p *= j;
            }
            System.out.println("Product: " + p);
            sum = sum + p;
        }
        System.out.println("The sum of the second series is: " + sum);
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last term: ");
        int n = sc.nextInt();
        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();
        SumSeries(n, x);
        SumSeries();
    }
}