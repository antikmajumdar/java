import java.util.*;
class BinarySearch{
    static void main(){
        // pre-defined array
        int arr[] = {1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year of graduation from school: ");
        // taking the year to be searched as user input
        int searchelement = sc.nextInt();
        int firstkey = 0;
        int lastkey = arr.length - 1;
        int midkey = (firstkey + lastkey)/2;
        // searching for the year in the pre-defined array
        while( firstkey <= lastkey ){
            if ( arr[midkey] < searchelement ){
                firstkey = midkey + 1;
            } else if ( arr[midkey] == searchelement ){ 
                // printing the statement when the search 
                // element is found in the array
                System.out.println("Record exists");
                break;
            } else {
                lastkey = midkey - 1;
            }
            midkey = (firstkey + lastkey)/2;
        } 
        if( firstkey > lastkey ){  
            // printing the statement when the search
            // cannot be found in the array 
            System.out.println("Record does not exist");
        }
    }
}