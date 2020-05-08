import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd, rate = 23000, vnd;

        System.out.print("How much USD to convert: ");
        usd = sc.nextDouble();

        vnd = usd * rate;

        System.out.print("Result: " + usd + " USD = " + vnd + " VND");
    }
}
