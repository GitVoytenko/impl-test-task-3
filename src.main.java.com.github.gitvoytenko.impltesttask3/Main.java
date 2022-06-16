package src.main.java.com.github.gitvoytenko.impltesttask3;

import java.math.BigInteger;

public class Main {
    public static BigInteger getFactorial(int f){
        if(f <= 1) return BigInteger.valueOf(1);
        return BigInteger.valueOf(f).multiply(getFactorial(f - 1));
    }

    public static int sumOfFactorial(BigInteger value){
        String str = value.toString();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum +=  Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }
    public static void main(String[] args) {
        BigInteger f = getFactorial(100);

        System.out.println(f);
        System.out.println(sumOfFactorial(f));
    }
}
