import java.util.*;
class Test_17{
    static void cal(){
        double y = 5.5;
        int x = -10;
        while(x <= 10) {
            System.out.println("Z= "+((x*3)+(0.5*x))/y);
            x += 2;
        }
    }
    static void floyds(int N){
        int k = 1;
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
    static void main(){
        System.out.print("Enter 1 for finding Z or 2 for Floyds triangle: ");
        Scanner sc = new Scanner(System.in);
        switch(sc.nextInt()){
            case 1:
            cal();
            break;
            case 2:
            System.out.print("Enter the value of N: ");
            floyds(sc.nextInt());
            break;
            default:
            System.out.println("Wrong choice.");
        }
        
    }
}