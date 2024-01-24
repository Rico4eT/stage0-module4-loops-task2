package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int divider = 2;
        while (divider <= printToInclusive) {
            boolean isPrime = true;
            int dividend = 2;
            while (dividend < divider){
                if (divider % dividend == 0){
                    isPrime = false;
                    break;
                }
                dividend++;
            }
            if(isPrime) {
                System.out.println(divider);
            }
            divider++;
        }
    }
}
