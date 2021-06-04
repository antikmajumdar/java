import java.util.*;
class test_19{
    static boolean checkVowel(char c){
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }
    }
    static void main(){
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toUpperCase();
        int count = 0;
        System.out.println("Pair of vowels are: ");
        for(int i = 0; i < s.length()-1; i++){
            if (checkVowel(s.charAt(i)) == true && checkVowel(s.charAt(i+1)) == true) {
                System.out.print(s.charAt(i));
                System.out.print(s.charAt(i+1));
                System.out.print(" ");
                count++;
            }
        }
        System.out.println("No. of pairs of vowels: " + count);
    }
}