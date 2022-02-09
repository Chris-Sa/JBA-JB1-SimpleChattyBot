import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int blocks = scanner.nextInt();

        if (blocks > width * length) {
            System.out.println("NO");
        } else if (blocks % width == 0 || blocks % length == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}