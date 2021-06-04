import java.util.*;
class Test_16{
    int sum(int A, int B){
        int sum = 0;
        for(int i = A; i <= B; i++){
            if(i % 2 == 0)
                sum += i;
        }
        return sum;
    }
    double sum(double N){
        double p = 1.0;
        // System.out.println(1.2 + 0.2);
        for(double i = 1.0; i <= N; i = i + 0.2){
            System.out.println(i);
            p *= i; 
        }
        return p;
    }
    int sum(int N){
        int sum = 0, r;
        while(N > 0){
            r = N % 10;
            N /= 10;
            if(r % 2 != 0)
            sum += r;
        }
        return sum;
    }
    static void main(){
        Test_16 ob = new Test_16();
        Scanner sc = new Scanner(System.in);
        
        //System.out.println("Enter two numbers: ");
        //System.out.println("Sum 1: " + ob.sum(sc.nextInt(), sc.nextInt()));
        
        System.out.println("Now enter another number in double type: ");
        System.out.println("Sum 2: " + ob.sum(sc.nextDouble()));
        
        //System.out.println("Again enter another number: ");
        //System.out.println("Sum 3: " + ob.sum(sc.nextInt()));
    }
}