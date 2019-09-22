public class Main {
    public static void main(String[] args) {
        Taxiservice taxiride = new Taxiservice();
        double kilometer = 56;

        double totalCost = taxiride.pricePerTrip(kilometer);
        System.out.println(totalCost);
    }
}
