public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Robot R = new Robot("Verter");
        R.greeting();
        int[] n = {-1,-2,100};
        System.out.println(SmallestIntegerFinder.findSmallestInt(n));
        System.out.println(Order.order("is2 Thi1s T4est 3a"));
        System.out.println( SumDigPower.sumDigPow(1,100).toString());
    }
}
