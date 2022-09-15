package com.yash.TDD.Assignment1;

public class ConsecutiveNumbersAddition {
	public static int add() {
		int consecutiveSum = 0;
		for (int i = 1; i <= 5; i++) {
			consecutiveSum = consecutiveSum + i;
		}
		return consecutiveSum;
	}
}