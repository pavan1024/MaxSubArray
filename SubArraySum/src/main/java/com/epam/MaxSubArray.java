package com.epam;

import java.util.Scanner;

import lombok.extern.slf4j.Slf4j;
@Slf4j
class MaxSubArray {

	private static int maxSubArray(int[] array) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			currentSum += array[i];
			if (currentSum > maxSum)
				maxSum = currentSum;
			if (currentSum <= 0)
				currentSum = 0;
		}
		return maxSum;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		log.info("Enter the length of an array ");
		int length = scan.nextInt();
		int[] array = new int[length];
		log.info("Enter " + length + " Elements");
		for (int i = 0; i < length; i++) {
			array[i] = scan.nextInt();
		}
		log.info(""+maxSubArray(array));
	}

}
