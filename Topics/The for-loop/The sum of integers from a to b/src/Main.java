import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        long product = 0L;

        for (int i = start; i <= end; i++) {
            product += i;
        }
        System.out.println(product);
    }
}