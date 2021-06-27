import java.util.*;
class Largest_Smallest{
    static void main(){
        Scanner sc = new Scanner(System.in);
        int l = 10;
        int array[] = new int[l];
        System.out.println("Enter 10 numbers: ");
        // taking 10 numbers as input from user
        for(int i = 0; i < l; i++){
            array[i] = sc.nextInt();
        }
        // bubble sorting for ascending order
        for(int i = 1; i < l - 1; i++){
            for(int j = 0; j <= l - 2; j++){
                if(array[j] > array[j + 1]){
                    int swap = array[j]; // taking a variable for swapping the numbers
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        // displaying the largest integer
        System.out.println("The largest integer is: " + array[l - 1]);
        // displaying the smallest integer
        System.out.println("The smallest integer is: " + array[0]);        
    }
}