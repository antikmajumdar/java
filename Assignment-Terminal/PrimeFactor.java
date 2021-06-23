import java.util.*;
class PrimeFactor{ // class starts
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        // taking number as input from user
        int num = sc.nextInt();
        int n = num;
        int i = 2;
        System.out.println("Prime Factors are: ");
        // checking prime factor
        while (n != 1) {
            if (n % i == 0) {
                // displaying the prime factor
                System.out.println(i);
                n = n / i;
                i = 2;
            } else {
                i++;
            }
        }
    }
} // class ends

/*
num - integer - to hold the number from the user input
n  - integer - to temporarily hold the value of num
i - integer - to check whether each number is prime or not
*/