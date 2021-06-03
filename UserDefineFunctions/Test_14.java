import java.util.*;
class Test_14{
    static void sort(int m[]) {
        Arrays.sort(m);
        System.out.print("After Sorting: ");
        for (int i=0; i<10; i++) {
            System.out.print(m[i]);
        }
    }
    static void main(){
        int numberArray[] = new int[10];
        System.out.println("Enter 10 Digits: ");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10; i++) {
            numberArray[i] = sc.nextInt();
        }
        sort(numberArray);
    }
}