import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class SumOfNumber {

    public static void main(String[] args){

        SumOfNumber main_object = new SumOfNumber();

        // Early test case
//        int x = 1 + 2 + 3 + 4 + 5;
//        System.out.println(x);
//        System.out.println(main_object.sumOfNumbers(100));
//        System.out.println(main_object.gaussVersion(100));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int newN = scanner.nextInt();

        int result = main_object.sumOfNumbers(newN);
        System.out.println(result);
        scanner.close();

    }

    int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    int gaussVersion(int n) {
        int sum = n * (n+1) / 2;
        return sum;
    }
}
