import java.util.Scanner;

public class usdvnd {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        System.out.println("Enter the number usd");
        Scanner sc = new Scanner(System.in);
        usd = sc.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Evalue in VND is : " + quydoi);
    }
}
