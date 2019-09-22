public class Taxiservice {
    double submissionCost = 60;
    double kmCost = 20;
    double percentDiscont = 0.95;
    int maxDiscont = 100;
    int sumWithDiscount = 1000;

    double pricePerTrip(double distance) {
        double price = kmCost * distance + submissionCost;
        if (price > sumWithDiscount) {
            double price1 = price * percentDiscont;
            if (price - price1 > maxDiscont) {
                price -= maxDiscont;
            } else price = price1;
        }
        return price;
    }

}
