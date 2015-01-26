package ecp.prj;

public class PrimeFactorCalculator {

	private long total;
	
	public long getLargestPrime(long total) {
	
		long largestPrime = 0L;
		this.total = total;
		
		for (long i = 2L; i * i < total; i++) {
			if (isDivisible(i)) {
				if (isPrime(i)) {
					largestPrime = i;
				}
			}
		}
		return largestPrime;
	}
	
	private boolean isDivisible(long currentNumber) {
		if (total % currentNumber == 0L) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean isPrime(long currentNumber) {
		boolean isPrime = true;
		
		for (long i = 2L; i < currentNumber; i++) {
			if (currentNumber % i == 0L) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}