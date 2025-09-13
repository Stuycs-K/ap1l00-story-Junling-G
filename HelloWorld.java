public class HelloWOrld {
  //return true if and only if x is prime,false otherwise.
	public static boolean isPrime(int x) {
	//just check divisibility for all values from `2` through `x - 1` inclusive.
  //(This is not a good algorithm, just use it)
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
					}
			}
		return true;
		}
	//return the nth prime,
  //e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.
	public static int nthPrime(int n) {
	//Loop through values and check if they are prime until you find n of them
  //use your isPrime function.
		int count = 0;
		for (int i = 2;; i++) {
			if (isPrime(i)) {
        count += 1;
      		}
			if (i == 2) {
				count = 0;
					}
			if (count == n) {
				return i;
					}
			 }
		}
	public static void main(String args[]) {
	    int[] fewPrimes = {0, 1, 2, 100, 200, 300};
	    int[] actualPrimes = {2, 3, 5, 547, 1229, 1993};
	    for (int i = 0; i < fewPrimes.length; i++) {
	        if (nthPrime(fewPrimes[i]) == actualPrimes[i]) {
	            System.out.println("pass");
	        }
	        else {
	            System.out.println("fail expected " + actualPrimes[i] + ", but value returned was" + nthPrime(fewPrimes[i]));
	        }
	    }
	 }
}
