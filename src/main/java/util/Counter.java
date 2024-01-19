package util;

import java.util.StringTokenizer;

//This is an example (faulty) class to be used for A4 Task1 and Task2
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

	// TODO: dev1- method for increment to closest even number
public void incrementToEven() {
    if (_ctr % 2 != 0) {
        _ctr++; // Increment if the current value is odd to make it even
    }
}

// TODO: dev1- method for decrement to closest even number
public void decrementToEven() {
    if (_ctr % 2 != 0) {
        _ctr--; // Decrement if the current value is odd to make it even
    }
}

	// TODO: dev2- method for increment to closest prime number
	public void incrementToPrime() {
		_ctr = -99;
	}

	// TODO: dev2- method for decrement to closest prime number
	public void decrementToPrime() {
		_ctr = -99;
	}

	// TODO: dev3- count the frequency of word in sentence,
	// refactor source code from dev1 and dev2
	public int countFrequency(String word, String sentence) {
		int count = 0;
		
		// Check for null or empty input
		if (word == null || sentence == null || word.isEmpty() || sentence.isEmpty()) {
			return count;
		}
	
		// Split the sentence into words
		String[] words = sentence.split("\\s+");
	
		// Count the frequency of the specified word
		for (String w : words) {
			if (w.equals(word)) {
				count++;
			}
		}
	
		return count;
	}
	

}
