import java.util.*;
class Test_7{
    static double cal(int u){
        double c = 0.0;
        if(u <= 100)
        c = (u * 1.25);
        else if(u > 100 && u <= 200)
        c = ((100 * 1.25) + ((u - 100) * 1.50));
        else if(u > 200)
        c = ((100 * 1.25) + (100 * 1.50) + ((u - 200) * 1.80));
        return c;
    }
    static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the customer number: ");
        int cn = in.nextInt();
        System.out.print("Enter the customer's name: ");
        String n = in.next();
        System.out.print("Enter the previous reading: ");
        int previous = in.nextInt();
        System.out.print("Enter the present reading: ");
        int present = in.nextInt();
        int uc =  present - previous;
        double amt = cal(uc);
        System.out.println("Customer No. \t Name \t Unit Consumed \t Amount");
        System.out.print(cn + "\t\t" + n + "\t\t" + uc + "\t\t" + amt);
    }
}