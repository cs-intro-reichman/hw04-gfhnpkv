public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code

        int min = 2;
        int max = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[max + 1];
        primes[0] = false;
        primes [1] = false;
        int prime = 2;
        while (prime > Math.sqrt(max)) {
            for (int i = prime + 1; i < primes.length;i++) {
                if (i % prime == 0) {
                    primes[i] = false; 
                }
            }
            prime++;
            boolean check = true;
            while (check) {
                if (primes[prime] == true) {
                    check = false;
                } else {
                    prime++;
                }
            }
        }
        int numberOfPrimes = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == true) {
                numberOfPrimes++;
            }
        }
        int precent = (numberOfPrimes / max ) * 100 ;
        System.out.println("There are " + numberOfPrimes + " primes between " + min + " and " + max +
                             " (" + precent + "% are primes)");
        
    } 
}
