package reisinger.htl;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve {

    @Override
    public boolean isPrime(int p) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        boolean[] primeBool = new boolean[p];

        for (int i=2; i<p; i++) {
            primeBool[i] = true;
        }


        for (int i = 2; i < p; i++) {
            if (primeBool[i]) {
                primeNumbers.add(i);
                for (int j = i * i; j < p+1; j += i) {
                    primeBool[j] = false;
                }
            }
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
