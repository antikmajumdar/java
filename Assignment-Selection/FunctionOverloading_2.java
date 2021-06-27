import java.util.*;
class FunctionOverloading_2{
    // finding and displaying the frequency of the
    // character present in the word given by the user
    void check(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(ch == str.charAt(i))
            count++;
        }
        System.out.println("Number of " + ch + " present in the word in word " + str + " is: " + count);
    }
    // finding and displaying the vowels
    // present in the word given by the user
    void check(String s1){
        // storing all vowels as a String
        String v = "aeiou";
        System.out.print("The vowels are: ");
        for(int i = 0; i < s1.length(); i++){
            // converting all the characters of the word into string
            String a = Character.toString(s1.charAt(i));
            if (v.contains(a)){
                System.out.print(a + " ");
            }
         }
    }
    static void main(){
        // creating an object of the class
        FunctionOverloading_2 ob = new FunctionOverloading_2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        System.out.print("Enter a character whose frequency is to be checked: ");
        char ch = sc.next().charAt(0);
        ob.check(str, ch);
        System.out.print("Now enter another word: ");
        ob.check((sc.next()).toLowerCase());
    }
}