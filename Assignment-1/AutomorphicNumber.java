class AutomorphicNumber{
    static boolean checkAutomorphic(int num){
       int n = num, count = 0, s = num * num;
       while(n > 0){
           count++;
           n /= 10;
       }
       
       int ld = s % (int)Math.pow(10, count);
    
       if(num == ld)
            return true;
       else
            return false;
    }
    static void main(){
        System.out.print("Automorphic Numbers are: ");
        for(int i = 1; i <= 2000; i++){
            if(checkAutomorphic(i))
                    System.out.print(i + " ");
        }
    }
}