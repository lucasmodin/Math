
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the values of coefficients a, b & c");
        diskriminantOgRødder ny = new diskriminantOgRødder(input);
        ny.getDiskriminant();
        ny.getRødder();
    }
}
