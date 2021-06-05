import java.util.*;
class Check {
    static void main () {
        HW ob = new HW();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        if(ob.compare(sc.nextLine(), sc.nextLine()) == 0)
            System.out.print("The two strings are equal. ");
        else
            System.out.print("The two strings are not equal. ");
        
    }
}