import java.util.*;
class Overload{
    // function with one integer parameter
    void display(int num){
        int p = 1, r = 0, n = num;
        while(n > 0){
            r = n % 10;
            p = p * r;
            n = n / 10;
        }
        // diaplaying the result
        System.out.println("Product of the digits of the given number: " + p);
    }
    // function with two integer parameters
    int display(int num, int d){
        int n = num, r = 0, count = 0;
        while(n > 0){
            while(n > 0){
                r = n % 10;
                if(r == d){
                    count++;
                }
                n = n / 10;
            }
        }
        return count;
    }
    static void main(){
        // creating an object
        Overload ob = new Overload();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (1 for product of digits or 2 for frequency of digits): ");
        // taking the choice as user input
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("Enter a number: ");
                ob.display(sc.nextInt());
                break;
            case 2:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                System.out.print("Enter a digit whose frequency is to be checked: ");
                int d = sc.nextInt();
                // diaplaying the result
                System.out.println("Frequency of the given digit in the number is: " + ob.display(num, d));
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}

/*
ch - integer - To save the user's choice
num - integer - to store the number from user input
d - integer - to store a digit from user input
p - integer - to store the product of all digits of the number
r - integer - to store remainder
n - integer - to temporarily hold the value of num
count - integer - to store the frequency of the digit d in the number num

// user define functions
display - void - num: integer - calculate and display the product of all digits of the the number
display - integer - num: integer, d: integer - return the frequency of the digit d in the number num
*/