class UniqueNumber {
    static void getnerateUniqueNumber () {
        int min = 1000;
        int max = 9999;
        int un = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Unique Number: " + un);
    }
    static void main () {
        getnerateUniqueNumber();
    }
}
