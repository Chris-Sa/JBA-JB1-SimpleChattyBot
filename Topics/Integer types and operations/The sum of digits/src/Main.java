import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int one = (number % 10);

        System.out.println(hundred + ten + one);
    }
}