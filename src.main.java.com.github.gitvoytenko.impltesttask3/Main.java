package src.main.java.com.github.gitvoytenko.impltesttask3;

import java.math.BigInteger;

public class Main {

    /**
     * Recursive method for calculating the factorial of a number
     *
     * @param f is a value from which we will extract the factorial
     * @return the result of multiplying all values returned by recursion to the values from which recursion is called
     */
    public static BigInteger getFactorial(int f){
        if(f <= 1) return BigInteger.valueOf(1);
        return BigInteger.valueOf(f).multiply(getFactorial(f - 1));
    }

    /**
     * Method for summing the digits from the factorial of a number
     *
     * @param value is a factorial of the number
     * @return the sum of all digits from the factorial of the number
     */
    public static int sumOfFactorial(BigInteger value){
        String str = value.toString();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum +=  Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
    public static void main(String[] args) {
        BigInteger f = getFactorial(100); // should use the BigInteger class, because the result can be a very large number of

        System.out.println(sumOfFactorial(f));
    }
}
