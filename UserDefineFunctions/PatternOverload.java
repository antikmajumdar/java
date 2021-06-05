import java.util.*;
class PatternOverload{
    void pattern(int n){
        for(int i = 1; i <= n; i++){
            int a;
            
            if(i % 2 == 0){
                a = 0;
            }
            else{
                a = 1;
            }
            
            for(int j = 1; j <= n; j++){
                System.out.print(a);
                if(a == 0)
                a = 1;
                else
                a = 0;
            }
            System.out.println();
        }
    }
    void pattern(int n, char c){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n + 1 - i; j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    void pattern(){
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void main(){
        PatternOverload ob = new PatternOverload();
        Scanner sc = new Scanner(System.in);
        ob.pattern(sc.nextInt());
        ob.pattern(sc.nextInt(), sc.next().charAt(0));
        ob.pattern();
    }
}