import java.util.*;
class Test_12{
    static double area(double a, double b, double c){
        double s = (a + b + c)/2.0;
        double r = Math.sqrt(s * (s - a) * (s - b) *  (s - c));
        return r;
    }
    static double area(int a, int b, int height){
        return ((1.0/2.0) * height * (a + b));
    }
    static double area(double diagonal1, double diagonal2){
        return ((1.0/2.0) * diagonal1 * diagonal2);
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter three numbers: ");
        System.out.println(area(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
        
        System.out.print("Enter three numbers: ");
        System.out.println(area(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        
        System.out.print("Enter two diagonals: ");
        System.out.println(area(sc.nextDouble(), sc.nextDouble()));
    }
}