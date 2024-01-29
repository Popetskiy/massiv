package org.example;

public class StatsService {
    public int theSumOfAllSales(int[] sales) {
        int theSumOfAllSales = 0;
        for (int sale : sales) {
            theSumOfAllSales = theSumOfAllSales + sale;
        }
        return theSumOfAllSales;
    }

    public int findAvgSales(int[] sales) {
        return theSumOfAllSales(sales) / sales.length;
    }

    public int findMaxSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findMinSales(int[] sales) {
        int min = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[min] >= sales[i]) {
                min = i;
            }
        }
        return 1 + min;
    }

    public int theSumOfAllSalesMinSales(int[] sales) {
        int avg = theSumOfAllSales(sales) / sales.length;
        int quantityMonths = 0;
        for (int sale : sales) {
            if (sale < avg) {
                quantityMonths++;
            }
        }
        return quantityMonths;
    }

    public int theSumOfAllSaleMaxSales(int[] sales) {
        int avg = theSumOfAllSales(sales) / sales.length;
        int quantityMonths = 0;
        for (int sale : sales) {
            if (sale > avg) {
                quantityMonths++;
            }
        }
        return quantityMonths;
    }
}
