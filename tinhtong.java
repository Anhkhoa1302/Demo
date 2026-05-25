package Demo;
import java.util.Scanner;
public class tinhtong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        sc.nextLine();
        int giatri = 0;
        int tong = 0;
        while (n >0) {
            giatri = n%10;
            n/=10;
            tong = tong + giatri;

        }
        System.out.println("Tong la: "+ tong);
    }
}
