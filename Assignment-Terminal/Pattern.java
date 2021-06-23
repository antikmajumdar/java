import java.util.*;
class Pattern{ // class starts
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (1 or 2): ");
        int ch = sc.nextInt(); // taking user's choice as input
        int k, i, j, l, space;
        switch(ch){ // swith case statement starts
            case 1:
                k = 1;
                for(i = 1; i <= 5; i++){
                    for(space = 1; space <= 5 - i; space++){
                        System.out.print(" ");
                    }
                    for(j = 1; j <= i; j++){
                       if (k == 10) {
                           System.out.print(0);
                           k = 1;
                       } else {
                           System.out.print(k++);
                       }
                    }
                    System.out.println();
                }
                break;
            case 2:
                l = 1;
                for(i = 1; i <= 5; i++){
                    k = l;
                    for(j = 1; j <= 5; j++){
                        if(k == 10){
                            System.out.print(0);
                            k = 1;
                        } else {
                            System.out.print(k++);
                        }
                    }
                    l = l + 2;
                    System.out.println();
                }
                break;
            default:
                System.out.println("Wrong choice.");
        } // switch case statement ends
    }
} // class ends

/*
ch - Character - To save the user's choice
k - Integer - For holding each digit
i - Integer - For iterating the outer for loop
j - Integer - For iterating the inner for loop
space - Integer - For iterating the loop for printing spaces
l - Integer - For incrementing the starting value of each row
*/