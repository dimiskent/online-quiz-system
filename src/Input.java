import java.util.Scanner;

public class Input {
    private final Scanner scanner;
    public Input() {
        scanner = new Scanner(System.in);
    }
    public int getChoice(int min, int max) {
        int n;
        while (true) {
            System.out.print("Choice: ");
            if(scanner.hasNextInt()) {
                n = scanner.nextInt();
                if(n <= max && n >= min)
                    break;
                else System.out.printf("Number must be between %d and %d.\n", min, max);
            } else {
                scanner.next();
                System.out.println("Invalid input! Number required!!!");
            }
        }
        return n;
    }
}
