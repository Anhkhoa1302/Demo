package Demo;

import java.util.Scanner;

public class demso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        sc.nextLine();
        int giatri = 0;
        int count = 0;
        while (n > 0) {
            giatri = n % 10;
            n = n / 10;

            if (giatri == 3) {
                count++;
            }
        }
        System.out.println(count);
    }

}
