class UniqueNumber {
    static void getnerateUniqueNumber () {
        int min = 100;
        int max = 999;
        int un = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Unique Number: " + un);
    }
    static void main () {
        getnerateUniqueNumber();
    }
}
