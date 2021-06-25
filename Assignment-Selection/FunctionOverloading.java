import java.util.*;
class FunctionOverloading{
    // for calculating the sum of the series
    void display(){
        int s = 0, p = 0;
        for(int i = 1; i <= 8; i++){
            p = p * 10 + 5;
            s = s + p;
            System.out.println(p);
        }
        System.out.print("S = " + s);
    }
    // for displaying the fibonacci series pattern 
    void display(int LN){
        for(int i = 1; i <= LN; i++){
            int a = 0, b = 1, s;
            for(int j = 1; j <= i; j++){
                if(j == 1)
                    System.out.print(a + " ");
                else if (j == 2)
                    System.out.print(b + " ");
                else {
                    System.out.print(a+b + " ");
                    s = a + b;
                    a = b;
                    b = s;
                }
            }
            System.out.println();
        }
    }
    static void main(){
        // creating an object of the class
        FunctionOverloading ob = new FunctionOverloading(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (1 or 2): ");
        int ch = sc.nextInt();
        switch (ch){ // switch case starts
            case 1:
                ob.display();
                break;
            case 2:
                System.out.print("Enter the number of lines of the pattern: ");
                ob.display(sc.nextInt());
                break;
            default:
                System.out.print("Wrong choice.");
        } // switch case ends
    }
}