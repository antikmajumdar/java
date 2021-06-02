import java.util.*;
class Test_8{
    void display(String st){
        String s = st.toLowerCase();
        System.out.println("The vowels are: ");
        for(int i = 0; i < st.length(); i++){
            if(s.charAt(i) == 'a' ||
            s.charAt(i) == 'e' ||
            s.charAt(i) == 'i' ||
            s.charAt(i) == 'o' ||
            s.charAt(i) == 'u') {
                System.out.println(st.charAt(i));
            }
        }
    }
    static void main(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        Test_8 ob = new Test_8();
        ob.display(w);
    }
}