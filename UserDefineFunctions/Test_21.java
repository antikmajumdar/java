import java.util.*;
class Test_21{
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 for Keith Number or 2 for the series: ");
        int ch = sc.nextInt();
        switch(ch){
            case 1:
                int i;
                
                System.out.print("Enter a 3 - digit number: ");
                int n = sc.nextInt();
                String s = Integer.toString(n);
                int a[] = new int[s.length()];
                for(i = 0; i < a.length; i++){
                    a[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
                }
                
                int sum;
                do {
                    sum = 0;
                    for(i = 0; i < a.length; i++){
                        sum = sum + a[i];
                    }
                    for(i = 0; i < a.length - 1; i++){
                        a[i] = a[i + 1];
                    }
                    a[i] = sum;
                } while(sum < n);
                
                if (sum == n) {
                    System.out.println("This is a Keith Number");
                } else {
                    System.out.println("This is not a Keith Number");
                }
                break;
            case 2:
                int r = 0;  
                for(i = 1; i <= 5; i++){
                    r = (r * 10) + i;
                    System.out.print(r + "\t");
                }
                break;
            default:
                System.out.print("Wrong choice");
        }
    }
}