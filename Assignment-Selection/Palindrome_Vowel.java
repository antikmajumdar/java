import java.util.*;
class Palindrome_Vowel{
    Scanner sc = new Scanner(System.in);
    // finding palindrome words from a sentence given by user
    void palin(){
        System.out.print("Enter a sentence: ");
        // setting user input in the String variable s 
        // with extra space at the last of the sentence
        String s = sc.nextLine() + " ";
        // making a duplicate copy of the sentence given by
        // the user and storing it in String variable d
        String d = s;
        // coverting the sentence in lowercase
        s = s.toLowerCase();
        String word = "";
        String dWord = "";
        int palincount = 0;
        System.out.print("Palindrome words are: ");
        // traversing each character of the sentence  
        for(int i = 0; i < s.length(); i++){
            //storing each character except the space 
            if(s.charAt(i) != ' '){
                word += s.charAt(i);
                dWord += d.charAt(i);
            } else {  
                String reverse = "";
                // reversing each word of the sentence
                for(int j = word.length() - 1; j >= 0; j--){
                    reverse += word.charAt(j);
                }
                // comparing each word with its reversed word
                if(word.equals(reverse)){
                    System.out.print(dWord + " ");
                    palincount++;
                }
                // reseting the word and dWord
                word = "";
                dWord = "";
            }
        }
        System.out.println();
        System.out.println("Total Palindrome words: " + palincount);
    }
    void count(){
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine() + " ";
        String d = s;
        s = s.toLowerCase();
        String word = "";
        String dWord = "";
        int count = 0;
        // storing all vowels as a String
        String v = "aeiou"; 
        System.out.print("The words are: ");
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                word += s.charAt(i);
                dWord += d.charAt(i);
            } else {
                // getting first and last characters of each word 
                // and converting it into String
                String a = Character.toString(word.charAt(0));
                String b = Character.toString(word.charAt(word.length()-1));
                // checking if the first or last characters 
                // of the words contain vowels
                if (v.contains(a) && v.contains(b)) { 
                    System.out.print(dWord + " ");
                    count++;
                }
                // reseting the word and dWord
                dWord = "";
                word = "";
            }
        }
        System.out.println();
        System.out.println("Total: " + count);
    }
    static void main(){
        // creating an object of the class
        Palindrome_Vowel ob = new Palindrome_Vowel();
        ob.palin();
        ob.count();
    }
}