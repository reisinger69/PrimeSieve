package reisinger.htl;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve {

    public EratosthenesPrimeSieve(int max) {
        boolean[] isPrimes = new boolean[max];
        for (int i = 0; i < max; i++) {
            isPrimes[i] = isPrime(i);
        }
    }

    @Override
    public boolean isPrime(int p) {
        int [] temp = new int [p+1];
        temp [0] = 2;

        int index = 1;
        int prime = 1;
        boolean isPrime = false;

        while((prime += 2) <= p+1) {
            isPrime = true;
            for(int i = 0; i < index; i++) {
                if(prime % temp [i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                temp [index++] = prime;
            }
        }
        ArrayList<Integer>  primeNumbers = new ArrayList<>();
        while(--index >= 0) {
            primeNumbers.add(temp [index]);
        }
        if (primeNumbers.contains(p)) {
            return true;
        }
        return false;
    }

    @Override
    public void printPrimes() {

    }
}
