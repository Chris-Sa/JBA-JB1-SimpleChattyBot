import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int none = 1;
        int pack = 20;
        int throng = 250;
        int zounds = 1000;
        int legion = 1000;

        if (number < none) {
            System.out.println("no army");
        } else if (number < pack) {
            System.out.println("pack");
        } else if (number < throng) {
            System.out.println("throng");
        } else if (number < zounds) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }

    }
}