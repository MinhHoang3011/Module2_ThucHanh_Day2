import java.util.Scanner;

public class USCLN {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("No greates common factor ");
        while (a != b ) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greates common fator : " +a);
    }
}
