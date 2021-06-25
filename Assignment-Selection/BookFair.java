import java.util.*;
class BookFair{
    // declaring member variables
    String bname;
    double price;
    // intializing the member variables with default values
    BookFair(){ // constructor
        bname = "";
        price = 0.0;
    }
    // getting inputs from the user
    void Input(){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the book: ");
        bname = sc.next();
        System.out.print("Enter the price of the book: ");
        price = sc.nextDouble();
    }
    // calculating discount and price after discount
    void calculate(){
        double d = 0.0;
        if(price <= 1000)
        d = (2.0 / 100.0) * price;
        else if(price > 1000 && price <= 3000)
        d = (10.0 / 100.0) * price;
        else if(price > 3000)
        d = (15.0 / 100.0) * price;
        price = price - d;
    }
    // displaying the final outputs
    void display(){
        System.out.println("Name of the book: " + bname);
        System.out.println("Price of the book after discount: " + price);
    }
    static void main(){
        // creating an object of the class
        BookFair ob = new BookFair();
        ob.Input();
        ob.calculate();
        ob.display();
    }
}