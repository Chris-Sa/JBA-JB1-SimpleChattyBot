import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = H - B - 1;
        int Y = A - B;

        int day = (X / Y) + 1;

        System.out.println(day);
    }
}