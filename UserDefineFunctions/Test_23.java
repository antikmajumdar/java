import java.util.*;
class Test_23{
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String s1 = sc.nextLine().toUpperCase();
        String s2 = sc.nextLine().toUpperCase();
        boolean isAnagram = false;
        if(s1.length() == s2.length()){
            outer:
            for(int i = 0; i < s1.length(); i++){
                int count = 0;
                for(int j = 0; j < s2.length(); j++){
                    if(s1.charAt(i) == s2.charAt(j)) {
                        count++;
                        isAnagram = true;
                    }
                    
                    if (count > 1) {
                        isAnagram = false;
                        System.out.print("The two strings are not anagram.");
                        break outer;
                    } 
                }
                if (count == 0) {
                    isAnagram = false;
                    System.out.print("The two strings are not anagram.");
                    break;
                }
            }
            
            if (isAnagram)
                System.out.print("The two strings are anagram.");
        }
        else
        System.out.print("The two strings are not anagram.");
    }
}