import java.util.Scanner;

public final class ScannerSingleton {
    private static Scanner scanner;

    private ScannerSingleton() {}

    public static Scanner create() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
