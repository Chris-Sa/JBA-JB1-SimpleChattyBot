import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean result = (weekend  && food >= 15 && food <= 25) || (!weekend && food >= 10 && food <= 20);
        System.out.println(result);
    }
}