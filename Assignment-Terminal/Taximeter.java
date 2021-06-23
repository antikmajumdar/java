import java.util.*;
class Taximeter{ // class starts
    int taxi_no, km;
    String name;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the taxi number: ");
        // taking taxi number as input from the user
        taxi_no = sc.nextInt();
        System.out.println("Enter the name: ");
        name = sc.next();
        System.out.println("Enter the km travelled: ");
        // taking the distance as input from the user
        km = sc.nextInt();
    }
    int calculate(){ 
        int bill = 0;
        if(km <= 1)
        bill = km * 25;
        else if(km > 1 && km <= 6)
        bill = (1 * 25) + ((km - 1) * 10);
        else if(km > 6 && km <= 12)
        bill = (1 * 25) + (6 * 10) + ((km - 7) * 15);
        else if(km > 12 && km <= 18)
        bill = (1 * 25) + (6 * 10) + (12 * 15) + ((km - 12) * 20);
        else if(km > 18)
        bill = (1 * 25) + (6 * 10) + (12 * 15) + (18 * 20) + ((km - 18) * 25);
        return bill;
    }
    void display(){ 
        System.out.println("Taxi no\t\tName\tKilometerstravelled\tBillamount");
        System.out.println(taxi_no + "\t\t" + name + "\t" + km + "\t\t\t" + calculate());
    }
    static void main(){
        //creating an object of the class
        Taximeter ob = new Taximeter();
        ob.input();
        ob.display();
    }
} // class ends


/*
taxi_no - integer - to hold the taxi number
km - integer - to hold the distance
name - string - for holding the name of traveller
bill - integer - for holding the value of the bill after calculation

// funcions
input - void - no arguments - to take user inputs
calculate - integer - no arguments - to calculate the valuation of bill
display - void - no arguments - to display the results
*/