import java.util.*;
class Fruit_Juice{
    int product_code, pack_size, product_price;
    String flavor, pack_type;
    // default constructor without parameters
    // and initializing the data members
    Fruit_Juice(){
        product_code = 0;
        flavor = "";
        pack_type = "";
        pack_size = 0;
        product_price = 0;
    }
    // taking user inputs
    void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Product Code: ");
        product_code = in.nextInt();
        System.out.print("Enter Flavor: ");
        flavor = in.next();
        System.out.print("Enter Pack Type: ");
        pack_type = in.next();
        System.out.print("Enter Pack Size: ");
        pack_size = in.nextInt();
        System.out.print("Enter Product Price: ");
        product_price = in.nextInt();
    }
    // calculating price after discount
    void discount(){
        product_price -= 10;
    }
    // displaying the result
    void display(){
        System.out.println("Product Code: " + product_code);
        System.out.println("Flavor: " + flavor);
        System.out.println("Pack Type: " + pack_type);
        System.out.println("Pack Size: " + pack_size);
        System.out.println("Product Price: " + product_price);
    }
    static void main(){
        // creating object
        Fruit_Juice ob = new Fruit_Juice();
        ob.input();
        ob.discount();
        ob.display();
    }
}

/*
product_code - integer - to hold the value of the product code
pack_size - integer - to hold the value of the pack size
product_price - integer - to hold the value of the price
flavor - String - to hold the name of the falvor
pack_type - String - to hold the type name of the pack

// user define functions
Fruit_Juice - contructor - no arguments - to set the default value of the instance varibale
input - void - no arguments - for user input
discount - void - no arguments - for calculating the product price after discount
display - void - no arguments - for displaying the result
*/