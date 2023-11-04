package assessment;

public class isPrime {
    protected static boolean isPrime(int number) {
        int divider = 2;
        for (int x = divider; x <= Math.sqrt(number); x++) {
            if(number % x == 0) {
                return false;
            }
        }
        return true;
    }

    protected static int countPrimes(int number) {
        int counter = 0;
        for(int x = 2;  x < number; x++) {
            if (isPrime(x)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
//        System.out.println(isPrime(11));
        System.out.println(countPrimes(1000));
    }
}
