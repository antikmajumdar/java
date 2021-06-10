import java.util.*;
class Series{
    static void choiceOne(){
        int s = 0, k = 2;
        for(int t = 1; t <= 6; t++){
            k = (int)Math.pow(2, t);
            if(t % 2 == 0)
                s = s - k;
            else
                s = s + k;
        }
        System.out.print("S = " + s);
    }
    static void choiceTwo(){
        int s = 0;
        int t = 1;
        int x = 2;
        while(t <= 100000) {
            s = s + t;
            t = t * 10 + x;
            x++;
        }
        System.out.print("S = " + s);
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice (A or B): ");
        String ch = sc.next().toUpperCase();
        switch(ch){
            case "A":
            choiceOne();
            break;
            case "B":
            choiceTwo();
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}