package chapter9;

public class Exercise9_2 {
    public static void main(String[] args) {
        Stock s = new Stock("ORCL", "Oracle Corporation");
        s.setPreviousPrice(34.5);
        s.setCurrentPrice(34.35);
        System.out.println("The price has changed for " + s.getChangePercent() + "%");
    }
}
