package util;

import java.util.StringTokenizer;

// This is an example (faulty) class to be used for A4 Task1 and Task2
public class Counter {
    public int _ctr;
    public int _multiplier;

    // method increments _ctr
    public void increment() {
        _ctr++; // faulty increment
    }

    // method decrements _ctr
    public void decrement() {
        _ctr--; // faulty decrement
    }

    // method resets _ctr
    public void reset() {
        _ctr = 0; // faulty reset, _ctr should rather be 0
    }

    // method multiplies _ctr by n
    public void multiplyBy(int multiplier) {
        _multiplier = multiplier; // no fault here
        _ctr = _ctr * _multiplier; // no fault here
    }

    // method for incrementing to the closest even number
    public void incrementToEven() {
        if (_ctr % 2 != 0) {
            _ctr++; // Increment if the current value is odd to make it even
        }
    }

    // method for decrementing to the closest even number
    public void decrementToEven() {
        if (_ctr % 2 != 0) {
            _ctr--; // Decrement if the current value is odd to make it even
        }
        while (_ctr % 2 != 0) {
            _ctr--; // Keep decrementing until an even number is found
        }
    }

    // method for incrementing to the closest prime number
    public void incrementToPrime() {
        _ctr = findNextPrime(_ctr + 1);
    }

    // method for decrementing to the closest prime number
    public void decrementToPrime() {
        _ctr = findPreviousPrime(_ctr - 1);
    }

    // Helper method to find the next prime number
    private int findNextPrime(int num) {
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    // Helper method to find the previous prime number
    private int findPreviousPrime(int num) {
        while (!isPrime(num)) {
            num--;
        }
        return num;
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method to count the frequency of a word in a sentence
    public void countFrequency(String word, String sentence) {
        int count = 0;

        // Check for null or empty input
        if (word == null || sentence == null || word.isEmpty() || sentence.isEmpty()) {
            _ctr = -99;  // or set to some default value, based on your requirements
            return;
        }

        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Count the frequency of the specified word
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }

        _ctr = count;
    }
}

