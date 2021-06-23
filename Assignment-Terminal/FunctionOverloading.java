import java.util.*;
class FunctionOverloading{ // class starts
    void compute(int m, int n){
        int min = ((m > n) ? n : m);
        System.out.println("Minimum value between the two numbers: " + min);
    }
    void compute(double a, double b){
        double d = a - b;
        System.out.println("Absolute difference of the two real numbers: " + Math.abs(d));
    }
    void compute(char x, char y){
        System.out.println("ASCII difference of the two characters: " + (x - y));
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        // creating an object of the class
        FunctionOverloading ob = new FunctionOverloading();
        System.out.println("Enter two numbers: ");
        // taking only integer data values as inputs
        ob.compute(sc.nextInt(), sc.nextInt());    
        System.out.println("Enter two numbers in double data type: ");
        // taking only double data values as inputs
        ob.compute(sc.nextDouble(), sc.nextDouble());
        System.out.println("Enter two characters: ");
        // taking only character data values as inputs
        ob.compute(sc.next().charAt(0), sc.next().charAt(0));
    }
} // class ends

/*
min - integer - to hold the minimum value
d - double - to hold the diffence between tow numbers

// user define funtions
compute - void - m: integer, n: integer - to calculate the minimum value
compute - void - a: double, b: double - to calculate the absolute value of two numbers
compute - void - x: char, y: char - to calculate the ascii diference of two character
*/