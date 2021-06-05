import java.util.*;
class BoxOffice{
    String title;
    float revenue;
    String star;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title of the movie: ");
        title = sc.nextLine();
        System.out.print("Enter the revenue: ");
        revenue = sc.nextFloat();
    }
    void compute(){
        if(revenue >= 0 && revenue <= 99999)
            star = "*";
        else if(revenue >= 100000 && revenue <= 499999)
            star = "**";
        else if(revenue >= 500000 && revenue <= 1500000)
            star = "***";
        else if(revenue > 1500000)
            star = "****";
    }
    void display(){
        System.out.println("Title of the Movie    Revenue earned   Star Awarded");
        System.out.println(title + "\t\t" + revenue + "\t\t" + star);
    }
    static void main(){
        BoxOffice ob = new BoxOffice();
        ob.accept();
        ob.compute();
        ob.display();
    }
}