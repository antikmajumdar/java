import java.util.*;
class HW{
    static int compare(String a, String b){
       int r = -1;
        if(a.equals(b))
        r = 0;
        return r;
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        if(compare(sc.nextLine(), sc.nextLine()) == 0)
            System.out.print("The two strings are equal. ");
        else
            System.out.print("The two strings are not equal. ");
    }
}