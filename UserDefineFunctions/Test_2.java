import java.util.*;
class Test_2{
    static int sum(int n){
        int s = 0;
        for(int i = 1; i <= n; i++){
            s = s + (i * (i + 1));
        }
        return s;
    }
    static void main(){
        System.out.print("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("the sum of the series: " + sum(n));
    }
}