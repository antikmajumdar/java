import java.util.*;
class Date{
    int dd, mm, yy;
    // default constructor without parameters
    Date(){
       dd = 0;
       mm = 0;
       yy = 0;
    }
    // default constructor with parameters
    Date(int d, int m, int y){
        dd = d;
        mm = m;
        yy = y;
        print_date();
    }
    // checking leap year
    boolean isLeap(){
        if(yy % 4 == 0){
            if(yy % 100 == 0){
                if(yy % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    // displaying the result
    void print_date(){
        System.out.println(dd+"/"+mm+"/"+yy);
        if (isLeap()) 
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
    static void main(){
        // creating object without parameters
        Date ob1 = new Date();
        // creating object with parameters
        Date ob2 = new Date(12, 2, 2000);
    }
}

/*
dd - integer - to hold the value of the date
mm - integer - to hold the value of the month
yy - integer - to hold the value of the year

// user define funtions
Date - contructor - no arguments - to set deafult value of dd and mm and yy
Date - contructor - d: integer, m: integer, y: integr - to set the value of date, month and year
isLeap - boolean - no arguments - to check the year is boolean or not
print_date - void - no arguments - to display the result
*/