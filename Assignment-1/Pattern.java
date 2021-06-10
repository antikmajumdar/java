import java.util.*;
class Pattern{
    static void choiceOne() {
        int k = 1;
        for(int i = 1; i <= 5; i++){
            for(int space = 1; space <= 5 - i; space++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
               if (k == 10) {
                   System.out.print(0);
                   k = 1;
               } else {
                   System.out.print(k++);
               }
            }
            System.out.println();
        }
    }
    static void choiceTwo() {
        int l = 1;
        for(int i = 1; i <= 5; i++){
            int k = l;
            for(int j = 1; j <= 5; j++){
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
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (1 or 2): ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                choiceOne();
                break;
            case 2:
                choiceTwo();
                break;
            default:
                System.out.println("Wrong choice.");
        }
    }
}