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
        int average = calculateSum(numbers) / numbers.length;
        return average;
    }

    public int findMaxMonth(int[] numbers) {
        int currentMax = getMax(numbers);
        int month = 0;
        int result = 0;
        for (int number : numbers) {
            month++;
            if (currentMax == number) {
                result = month;
            }
        }
        return result;
    }

    public int getMax(int[] numbers) {
        int currentMax = numbers[0];

        for (int number : numbers) {
            if (currentMax < number) {
                currentMax = number;
            }
        }
        return currentMax;
    }

    public int findMinMonth(int[] numbers) {
        int currentMin = getMin(numbers);
        int month = 0;
        int result = 0;
        for (int number : numbers) {
            month++;
            if (currentMin == number) {
                result = month;
            }
        }
        return result;
    }

    public int getMin(int[] numbers) {
        int currentMin = numbers[0];

        for (int number : numbers) {
            if (currentMin > number) {
                currentMin = number;
            }
        }
        return currentMin;
    }

    public int findMoreAverage(int[] numbers) {
        int average = findAverage(numbers);
        int count = 0;
        for (int number : numbers){
            if (number > average){
                count++;
            }
        }
        return count;
    }

    public int findLessAverage(int[] numbers) {
        int average = findAverage(numbers);
        int count = 0;
        for (int number : numbers){
            if (number < average){
                count++;
            }
        }
        return count;
    }
}
