import java.util.*;
class Test_15{
    static boolean search(int m[], int ns){
        boolean a = false;
        // for (int i=0; i<m.length; i++)
        for(int i : m){
            if(m[i] == ns) {
                a = true;
                break;
            }
        }
        return a;
    }
    static void main(){
        Scanner sc = new Scanner(System.in);
        int m[] = new int[10];
        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++){
            m[i] = sc.nextInt();
        }
        System.out.print("Enter a separate number to be checked: ");
        int ns = sc.nextInt();
        if (search(m, ns)) {
            System.out.println("Element is exsist");
        } else {
            System.out.println("Element not exsist");
        }
    }
}