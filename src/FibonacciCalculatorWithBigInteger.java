import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciCalculatorWithBigInteger {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet Fibonacci sayısını alt alta yazmamı istiyorsun? ");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("Sıfırdan büyük sayı girilmesi gereklidir. Programı tekrar çalıştırın.");
        }
        BigInteger[] allOurWantToWriteFibonacciNumbers = counterFibonacciNumbers(n);
        for(int i = 0; i < n; i++){
            BigInteger fibonacci = allOurWantToWriteFibonacciNumbers[i];
            System.out.println(fibonacci);
        }
    }

    public static BigInteger[] counterFibonacciNumbers(int num){
        if(num <= 0){
            System.out.println("Sıfırdan büyük sayı girilmesi gereklidir. Programı tekrar çalıştırın.");
        }
        BigInteger[] fibonacciNum = new BigInteger[num];
        fibonacciNum[0] = BigInteger.ZERO;
        if(num > 1){
            fibonacciNum[1] = BigInteger.ONE;
        }
        for(int i = 2; i < fibonacciNum.length; i++){
            BigInteger lastOne = fibonacciNum[i-1];
            BigInteger lastTwo = fibonacciNum[i - 2];
            BigInteger newFibonacciNum = lastOne.add(lastTwo);
            fibonacciNum[i] = newFibonacciNum;
        }
        return fibonacciNum;
    }
}
