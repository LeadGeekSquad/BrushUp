public class CheckPrimeNumber {
    public static void main(String[] args) {

        CheckPrimeNumber p1 = new CheckPrimeNumber();
        p1.checkPrime(29);
    }

    public void checkPrime(int num){
        //int num = 29;
        boolean isPrime = true;

        for (int i =2; i<=num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
               System.out.println(num + " is a prime number.");
        } else {
               System.out.println(num + " is not a prime number.");
        }
    }
}

