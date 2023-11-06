import java.util.Scanner;

public class BankApp {
	
	    public static int sumPrime(int rangeLeft, int rangeRight) {
	        int answer = 0;

	        for (int num = rangeLeft; num <= rangeRight; num++) {
	            if (isPrime(num)) {
	                answer += num;
	            }
	        }

	        return answer;
	    }

	    static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);

	        int rangeLeft = in.nextInt();
	        int rangeRight = in.nextInt();

	        int result = sumPrime(rangeLeft, rangeRight);
	        System.out.print(result);
	    }
	

		
	}


