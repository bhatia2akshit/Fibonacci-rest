package io.swagger.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public String getFibonacci(int lower_bound, int upper_bound) {

		if (upper_bound < 2 & upper_bound > 0) {
			return "0 1";
		}

		else if (upper_bound == 0) {
			return "0";
		} else if (upper_bound < 0) {
			return "Enter the value of input larger than 0 please";
		}

		List<Integer> fiboSeries = findFibonacci(upper_bound);
		String fibonacci = "";
		if (fiboSeries.size() > 0) {
			int seriesSize = fiboSeries.size();
			for (int i = 0; i < seriesSize - 1; i++) {
				if (fiboSeries.get(i) >= lower_bound)
					fibonacci += fiboSeries.get(i) + " ";
			}

			// printing the last element so that there is no space afterwards
			fibonacci += fiboSeries.get(seriesSize - 1);

			return fibonacci;
		}

		else
			return "not a fibo number";
	}

	private List<Integer> findFibonacci(int k) {
		List<Integer> series = new ArrayList<Integer>();
		int i = 1;
		series.add(0);
		series.add(1);
		int size = series.size();
		while (series.get(size - 1) < k) {

			series.add(series.get(size - 2) + series.get(size - 1));
			size++;

		}

		if (series.get(size - 1) == k)
			return series;
		else
			return new ArrayList<Integer>();
	}

}
