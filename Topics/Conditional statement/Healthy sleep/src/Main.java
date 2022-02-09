import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minS = scanner.nextInt();
        int maxS = scanner.nextInt();
        int sleep = scanner.nextInt();

        if (sleep < minS) {
            System.out.println("Deficiency");
        } else if (sleep > maxS) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }

    }
}