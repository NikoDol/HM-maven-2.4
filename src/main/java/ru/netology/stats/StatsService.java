package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int findAverage(int[] numbers) {
        int average;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;
        return average;
    }

    public int findMaxMonth(int[] numbers) {
        int currentMax = numbers[0];
        int month = 0;
        for (int number : numbers) {
            if (currentMax < number) {
                currentMax = number;
            }
        }
        int result = 0;
        for (int number : numbers) {
            month++;
            if (currentMax == number) {
                result = month;
            }
        }
        return result;
    }

    public int findMinMonth(int[] numbers) {
        int currentMin = numbers[0];
        int month = 0;
        for (int number : numbers) {
            if (currentMin > number) {
                currentMin = number;
            }
        }
        int result = 0;
        for (int number : numbers) {
            month++;
            if (currentMin == number) {
                result = month;
            }
        }
        return result;
    }

    public int findMoreAverage(int[] numbers) {
        int average;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;

        int count = 0;
        for (int number : numbers){
            if (number > average){
                count++;
            }
        }
        return count;
    }

    public int findLessAverage(int[] numbers) {
        int average;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        average = sum / numbers.length;

        int count = 0;
        for (int number : numbers){
            if (number < average){
                count++;
            }
        }
        return count;
    }
}
