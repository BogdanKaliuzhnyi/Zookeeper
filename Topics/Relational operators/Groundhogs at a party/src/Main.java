import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean answer = false;

        if (weekend && cups >= 15 && cups <= 25) {
            answer = true;
        } else if (!weekend && cups >= 10 && cups <= 20) {
            answer = true;
        }
        System.out.println(answer);
    }
}