public class Main {
    public static void main(String[] args) {
        Taxiservice taxiride = new Taxiservice();
        double kilometr = 56;

        double totalCost=taxiride.pricePerTrip(kilometr);
        System.out.println(totalCost);
    }
}