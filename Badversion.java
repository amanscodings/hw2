import java.util.Scanner;

public class Main {
    public static boolean isBadVersion(int version) {
        int bad = 4;
        if (version >= bad) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkVersion(int version) {
        if (isBadVersion(version)) {
            System.out.println("Version " + version + " is considered bad.");
        } else {
            System.out.println("Version " + version + " is considered good.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the version number to check: ");
        int version_to_check = scanner.nextInt();
        checkVersion(version_to_check);
    }
}
