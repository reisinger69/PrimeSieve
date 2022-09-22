package reisinger.htl;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve {

    ArrayList<Integer> primes;


    public EratosthenesPrimeSieve(int max) {
        primes = new ArrayList<>();

        for (int i = 0; i < max; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        printPrimes();
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
        for (int i :
                primes) {
            System.out.print(i + " - ");
        }
        System.out.print("Ende");
    }
}
