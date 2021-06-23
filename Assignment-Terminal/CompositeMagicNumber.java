class CompositeMagicNumber{ // class starts
    static void main(){ // void main starts
        int i, j, n, temp, r, sum;
        boolean isComposite;
        System.out.println("The composite magic numbers between 10 and 200 are: ");
        for(i = 10; i <= 200; i++){
            n = i;
            isComposite = false;
            // checking for composite number
            for(j = 2; j <= n / 2; j++){
                if(n % j == 0){
                    isComposite = true;
                    break;
                }
            }
            // checking for magic number
            if(isComposite){
                temp = i;
                r = 0;
                sum = 0;
                while(temp > 9){
                    while(temp > 0){
                        r = temp % 10;
                        sum = sum + r;
                        temp = temp / 10;
                    }
                    temp = sum;
                    sum = 0;
                }
                if(temp == 1)
                    System.out.println(i);
            }
        }
    } // void main ends
} // class ends

/*
i - integer - For iterating the outer for loop
j - integer - For iterating the inner for loop
n - integer - to temporarily hold the value of i
temp - integer - to temporarily hold the value of i for magic number checking
r - integer - to store the remainder
sum - integer - to store the sum of digits of the composite number
isComposite - boolean - to hold the desicion as ture or false for composite number checking
*/