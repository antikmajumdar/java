import java.util.*;
class Test_11{
    static void num_cal(int num, char ch){
        if(ch == 's')
        System.out.println("The square of the number is: " + (num * num));
        else
        System.out.println("The cube of the number is: " + (num * num * num));
    }
    static void num_cal(int a, int b, char ch){
        if(ch == 'p')
        System.out.println("The product of the integers is: " + (a * b));
        else
        System.out.println("The sum of the integers is: " + (a + b));
    }
    static void num_cal(String str1, String str2){
        if(str1.equals(str2))
        System.out.println("The two strings are equal");
        else
        System.out.println("The two strings not are equal");
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number and a character 's' or anything else: ");
        num_cal(sc.nextInt(), sc.next().charAt(0));
        System.out.print("Enter two numbers and a character 'p' or anything else: ");
        num_cal(sc.nextInt(), sc.nextInt(), sc.next().charAt(0));
        System.out.print("Enter two strings: ");
        num_cal(sc.next(), sc.next());
    }
}