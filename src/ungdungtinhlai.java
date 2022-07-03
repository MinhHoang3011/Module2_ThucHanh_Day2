import java.util.Scanner;

public class ungdungtinhlai {
    public static void main(String[] args) {
        double money = 0;
        int    month = 1;
        double interset_rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment Amout: ");
        money = sc.nextDouble();
        System.out.println("Enter Number of Month : ");
        month = sc.nextInt();
        System.out.println("Enter annual interset rate in percentage: ");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rate /100 /12) * 3;
        }
        System.out.println("Total of interset : " + total_interset);
    }
}
