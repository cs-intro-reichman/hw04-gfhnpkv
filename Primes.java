public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code

        int min = 2;
        int max = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[max + 1];
        int prime = 2;
        for (int i = 2; i < primes.length;i++) {
            primes[i] = true;
        }
        while (prime < Math.sqrt(max)) {
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
        double numberOfPrimes = 0.0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == true) {
                numberOfPrimes++;
            }
        }
        int precent = (int) (numberOfPrimes / max  * 100) ;
        System.out.println("There are " + (int)numberOfPrimes + " primes between " + min + " and " + max +
                             " (" + precent + "% are primes)");
        
    } 
}
