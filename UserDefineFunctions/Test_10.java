import java.util.*;
class Test_10{
    static String buzzChecking(int n){
        if(n % 7 == 0 || n % 10 == 7){
            return "It is a Buzz Number";
        } else {
            return "It is not a Buzz Number";
        }
    }
    static String compositeChecking(int n){
        String isComposite = "It is Not a Composite Number";
        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                isComposite = "It is a Composite Number";
            }
        }
        return isComposite;
    }
    static void number(){
        System.out.print("Enter your choice (1 for Buzz Number checking and 2 for Composite Number checking): ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        int n;
        switch(ch){
            case 1: 
            System.out.print("Enter a number for checking: ");
            n = sc.nextInt();
            System.out.println(buzzChecking(n));
            break;
            case 2:
            System.out.print("Enter a number for checking: ");
            n = sc.nextInt();
            System.out.println(compositeChecking(n));
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
    static void main(){
        number();
    }
}