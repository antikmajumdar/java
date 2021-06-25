import java.util.*;
class Marks{
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        // for taking the number of students as input
        int n = sc.nextInt();
        
        System.out.println("Enter the name of the student and his total marks in computer applications: ");
        String name [] = new String[n];
        int marks [] = new int[n];
        int count = 0;
        boolean status = true;
        int x;
        
        // for taking the names of students and marks as input
        for(int i = 0; i < n; i++){
            System.out.print("Name: ");
            name[i] = sc.next();
            
            System.out.print("Marks: ");
            // for checking if the marks entered by the user is less than 100
            do {
                x = sc.nextInt();
                if (x > 100) {
                    System.out.print("Marks should be less than 100. Please re-enter: ");
                } else {
                    marks[i] = x;
                    status = false;
                }
            } while(status);
            
            // counting the number of students who got 90 and above
            if (marks[i] >= 90) { 
                count++;
            }
            status = true;
        }
        System.out.println("Number of students who got 90 and above: " + count);
        
        System.out.println("Names and marks of students who got 90 and above: ");
        int h = 0;
        
        for(int i = 0; i < n; i++){
            if (marks[i] >= 90) {
                // displaying the names and marks of students who got 90 and above
                System.out.println(name[i] + ": " + marks[i]);
                // for finding the highest marks
                if (marks[i] > h) {
                    h = marks[i];
                }
            }
        }
        
        System.out.println("Students who got highest marks: ");
        for(int i = 0; i < n; i++){
            if (marks[i] == h) {
                // displaying the names and marks of students who got highest
                System.out.println(name[i] + ": " + marks[i]);
            }
        }
    }
}