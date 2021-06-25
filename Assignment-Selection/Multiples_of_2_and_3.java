
import java.util.*;
class Multiples_of_2_and_3{
    int n = 10, sum = 0;
    int a [] = new int [n];
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3-digit numbers: ");
        for(int i = 0; i < n; i++){
            boolean status = true;
            do {
                int x = sc.nextInt();
                if (x >= 1000 || x < 100) {
                    System.out.print("Number should be 3-digit. Please re-enter: ");
                } else {
                    a[i] = x;
                    status = false;
                }
            } while(status);
        }
    }
    boolean check(int x){
        if(x % 2 == 0 && x % 3 == 0)
        return true;
        else
        return false;
    }
    void display(){
        System.out.println("3-digit numbers divisible by 2 and 3 are: ");
        for(int i = 0; i < n; i++){
            if (check(a[i])) {
                System.out.println("Number: " + a[i] + " and Position: " + i);
                sum += a[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
    static void main(){
        Multiples_of_2_and_3 ob = new Multiples_of_2_and_3();
        ob.accept();
        ob.display();
    }
}