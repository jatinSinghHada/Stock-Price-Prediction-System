package com.prediction;
import java.util.*;

public class StockPricePrediction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of historical days:");
        int numDays = scanner.nextInt();

        List<Double> historicalPrices = new ArrayList<>();
        List<Double> buyPrices = new ArrayList<>();
        List<Double> sellPrices = new ArrayList<>();

        for (int i = 1; i <= numDays; i++) {
            System.out.println("Enter the stock price for day " + i + ":");
            double price = scanner.nextDouble();
            historicalPrices.add(price);

            System.out.println("Enter the buy price for day " + i + ":");
            double buyPrice = scanner.nextDouble();
            buyPrices.add(buyPrice);

            System.out.println("Enter the sell price for day " + i + ":");
            double sellPrice = scanner.nextDouble();
            sellPrices.add(sellPrice);
        }

        System.out.println("Enter the number of days for future prediction:");
        int days = scanner.nextInt();

        double predictedProfit = predictFutureProfit(historicalPrices, buyPrices, sellPrices, days);
        System.out.println("Predicted profit for the next " + days + " days: $" + predictedProfit);

        scanner.close();
    }

    public static double predictFutureProfit(List<Double> historicalPrices, List<Double> buyPrices, List<Double> sellPrices, int days) {
        double sumProfit = 0;

        for (int i = 0; i < historicalPrices.size(); i++) {
            double profit = sellPrices.get(i) - buyPrices.get(i);
            sumProfit += profit;
        }

        double averageProfitPerDay = sumProfit / historicalPrices.size();
        double predictedProfit = averageProfitPerDay * days;

        return predictedProfit;
    }
}

