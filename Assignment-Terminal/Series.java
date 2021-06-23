import java.util.*;
class Series{ // class starts
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (A or B): ");
        String ch = sc.next().toUpperCase(); // taking user's choice as input
        int s, k, t, x;
        switch(ch){ // switch case statement starts
            case "A":
                s = 0;
                k = 2;
                for(t = 1; t <= 15; t++){
                    k = (int)Math.pow(2, t);
                    if(t % 2 == 0)
                        s = s - k;
                    else
                        s = s + k;
                   }
                System.out.print("S = " + s);
                break;
            case "B":
                s = 0;
                t = 1;
                x = 2;
                while(t <= 100000) {
                    s = s + t;
                    t = t * 10 + x;
                    x++;
                }
                System.out.print("S = " + s);
                break;
            default:
            System.out.println("Wrong choice");
        } // switch case statement ends
    }
} // class ends

/*
ch - String - To save the user's choice
s - integer - To hold the sum of the series
k - integer - to hold the value of power of 2
t - integer - For iterating the loop
x - integer - for holding last digit of each number of the series
*/