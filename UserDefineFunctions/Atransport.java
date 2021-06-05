import java.util.*;
class Atransport{
    String name;
    int w;
    double charge;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer: ");
        name = sc.nextLine();
        System.out.println("Enter the weight of the parcel from the user: ");
        w = sc.nextInt();
    }
    void calculate(){
        if(w <= 10)
            charge = w * 25;
        else if(w > 10 && w <= 30)
            charge = 250 + ((w - 10) * 20);
        else if(w > 30)
            charge = 250 + 400 + (w - 30) * 10;
        charge = charge + (charge * (5.0 / 100.0));
    }
    void print(){
        System.out.println("Name     Weight     Bill amount");
        System.out.println(name + "\t" + w + "\t" + charge);
    }
    static void main(){
        Atransport ob = new Atransport();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}