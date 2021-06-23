class AutomorphicNumber{ // class starts
    static void main(){ 
        int i, n, count, ld, s;
        boolean checkAutomorphic;
        System.out.print("Automorphic Numbers are: ");
        for(i = 1; i <= 2000; i++){
            n = i;
            count = 0;
            s = i * i;
            // checking the number of digits in a number
            while(n > 0){
               count++;
               n /= 10;
            }
            ld = s % (int)Math.pow(10, count);
            // checking for automorphic number
            if(i == ld)
                checkAutomorphic = true;
            else
                checkAutomorphic = false;
            // displaying the automorphic number
            if(checkAutomorphic)
                System.out.print(i + " ");
        }
    }
} // class ends

/*
i - integer - For iterating the outer for loop
n - integer - to temporarily hold the value of i
count - integer - for counting the digits of each number
s - integer - to storing the square value of each number
ld - integer - to get the last digit(s)
checkAutomorphic - boolean - to hold the decision true or false
*/