import java.util.*;
class Matrix{
    // declaring the instance variables
    int r = 3, c = 3, s = 0;
    int a[][] = new int[r][c];
    // accepting the values of the matrix as user input
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of 3 x 3 matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Enter the number of row-" + (i+1) + " and col-" + (j+1) + ": ");
                a[i][j] = sc.nextInt();
            }
        }
    }
    // checking whether the number is 2-digit even or not
    int check(int num){
        if(num > 9 && num < 100){
            if(num % 2 == 0)
            return 1;
            else 
            return 0;
        } else {
            return 0;
        }
    }
    // displaying all the 2-digit even numbers 
    // along with their position in the matrix and their sum
    void display(){
        System.out.println("2 Digit Even Numbers are: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(check(a[i][j]) == 1){
                    s += a[i][j];
                    System.out.println("Number: "+ a[i][j] + " Position: " + "["+i+"]["+j+"]");
                }
            }
        }
        System.out.println("Sum: " + s);
    }
    static void main(){
        // creating an object of the class
        Matrix ob = new Matrix();
        ob.accept();
        ob.display();
    }
}