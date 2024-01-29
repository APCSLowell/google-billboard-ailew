public class Main {
    public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";

    public static void main(String[] args) {
        for (int i = 0; i <= e.length() - 10; i++) {
            String digits = e.substring(i, i + 10);
            double dNum = Double.parseDouble(digits);

            if (isPrime((long) dNum)) {
                System.out.println("First 10-digit prime in 'e': " + digits);
                break;
            }
        }
    }

    public static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
