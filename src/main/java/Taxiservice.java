public class Taxiservice {
    double submissionCost = 60;
    double kmCost = 20;
    double percentDiscount = 0.95;
    int maxDiscount = 100;
    int sumWithDiscount = 1000;

    double pricePerTrip(double distance) {
        double price = kmCost * distance + submissionCost;
        if (price > sumWithDiscount) {
            double price1 = price * percentDiscount;
            if (price - price1 > maxDiscount) {
                price -= maxDiscount;
            } else price = price1;
        }
        return price;
    }

}

