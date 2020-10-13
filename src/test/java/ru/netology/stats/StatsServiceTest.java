package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    int [] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldCalculateSum () {
        int expected = 180;
        int actual = service.calculateSum (numbers);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage () {
        int expected = 15;
        int actual = service.findAverage (numbers);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxMonth () {
        int expected = 8;
        int actual = service.findMaxMonth (numbers);
        assertEquals(expected, actual);
    }

    @Test
    void shouldMinMonth () {
        int expected = 9;
        int actual = service.findMinMonth (numbers);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthMoreAverage () {
        int expected = 5;
        int actual = service.findMoreAverage (numbers);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthLessAverage () {
        int expected = 5;
        int actual = service.findLessAverage (numbers);
        assertEquals(expected, actual);
    }
}
