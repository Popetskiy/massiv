package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {
    @Test
    public void PRTheSumOfAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.theSumOfAllSales(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void PRfindAvgSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAvgSales(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void PRfindMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxSales(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void PRffindMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSales(sales);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void PRtheSumOfAllSalesMinSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.theSumOfAllSaleMaxSales(sale);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    public void PRtheSumOfAllSaleMaxSales() {
        StatsService service = new StatsService();
        int[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.theSumOfAllSaleMaxSales(sale);
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}
