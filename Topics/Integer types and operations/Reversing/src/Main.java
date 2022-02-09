import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int A = number / 100;
        int B = (number % 100) / 10;
        int C = number % 10;

        int result = (C * 100) + (B * 10) + A;

        System.out.println(result);
    }
}